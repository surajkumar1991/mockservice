package com.vuclip.ubs.models.redis;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vuclip.ubs.controller.SchedularControllers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class RedisConnection {
    private Logger logger = LogManager.getLogger(SchedularControllers.class);

    private RedisTemplate<String, Object> template = null;
    private String cacheServer;

    public RedisConnection(String cacheServer) {
        this.cacheServer = cacheServer;
        init();
    }

    @SuppressWarnings("unused")
    private RedisConnection() {
    }

    @SuppressWarnings("deprecation")
    private void init() {
        if (template == null) {
            logger.info("========================== Setting up Redis Template ==========================");
            template = new RedisTemplate<>();
            String config[] = cacheServer.split(":");

            JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
            jedisConnectionFactory.setHostName(config[0]);
            jedisConnectionFactory.setPort(Integer.parseInt(config[1]));

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
            objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

            @SuppressWarnings({"rawtypes", "unchecked"})
            Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
            jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

            template.setValueSerializer(jackson2JsonRedisSerializer);
            template.setKeySerializer(new StringRedisSerializer());
            template.setConnectionFactory(jedisConnectionFactory);
            template.afterPropertiesSet();
            logger.info("========================== Redis Template is set ==========================");
        }
    }

    public RedisTemplate<String, Object> getRedisConnection() {
        init();
        return template;
    }

    public void closeConnection() {
        if (template != null)
            if (template.getConnectionFactory() != null)
                if (template.getConnectionFactory().getConnection() != null)
                    template.getConnectionFactory().getConnection().close();
    }

    public ValueOperations<String, Object> getValueOperation() {
        return getRedisConnection().opsForValue();
    }

}