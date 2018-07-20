package com.vuclip.ubs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.vuclip.ubs", "com.vuclip.ubs.*",
		"com.vuclip.ubs.common", "com.vuclip.ubs.config", "com.vuclip.ubs.controller",
		"com.vuclip.ubs.ss" })
@ComponentScan(basePackages = "com.vuclip.ubs")
@EnableAutoConfiguration
public class UBSMockApp {
//	@Bean(name = "jdbcTemplate")
//	public org.springframework.jdbc.core.JdbcTemplate jdbcTemplate() {
//		System.out.println("rahul");
//		return null;
//		// return JDBCTemplateFactory.getDbConnection(env.getProperty("dbServer"),
//		// env.getProperty("dbPort"),
//		// env.getProperty("dbName"), env.getProperty("dbUser"),
//		// env.getProperty("bPassword"));
//	}

	@Bean(name = "var")
	public String var() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(UBSMockApp.class, args);

	}

}
