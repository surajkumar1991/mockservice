package com.vuclip.ubs.controller;

import com.vuclip.premiumengg.automation.subscription_service.common.models.SubscriptionStatus;
import com.vuclip.subscription.nosql.docs.UserKeySubscriptionIdDoc;
import com.vuclip.subscription.nosql.docs.UserSubscriptionDoc;
import com.vuclip.ubs.common.JDBCTemplateFactory;
import com.vuclip.ubs.models.redis.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class RedisController {
    private Logger logger = LogManager.getLogger(RedisController.class);
    private RedisConnection redisTemplateConnection = null;
    private JdbcTemplate jdbcTemplate = null;

    @RequestMapping(value = "/createRedisEntry", method = {RequestMethod.POST, RequestMethod.GET})
    public ResponseEntity<String> conversionPost(HttpServletRequest request) {
        logger.info("REDIS KEY CREATION");
        String dbDetails[] = request.getParameter("dbDetails").trim().split(":");

        jdbcTemplate = JDBCTemplateFactory.getDbConnection(dbDetails[0].trim(), dbDetails[1].trim(),
                dbDetails[2].trim(), dbDetails[3].trim(), dbDetails[4].trim());

        String cacheServer = request.getParameter("cacheServer");
        redisTemplateConnection = new RedisConnection(cacheServer);

        List<String> keys = new ArrayList<>();
        UserSubscriptionTable createdUserRecord = getUserSubscriptionByUserID(request.getParameter("tableName"), request.getParameter("colName"), request.getParameter("colVal"));
        logger.info(createdUserRecord.toString());
        if (request.getParameter("userKey") != null && request.getParameter("userKey").equalsIgnoreCase("true")) {
            keys.add(createUserIdRedisKey(createdUserRecord.getSubscriptionId(), "" + createdUserRecord.getProductId(),
                    createdUserRecord.getUserId()));
        }

        if (request.getParameter("msisdnKey") != null && request.getParameter("msisdnKey").equalsIgnoreCase("true")) {
            keys.add(createMsisdnRedisKey(createdUserRecord.getSubscriptionId(), "" + createdUserRecord.getProductId(),
                    createdUserRecord.getMsisdn()));
        }
        if (request.getParameter("subKey") != null && request.getParameter("subKey").equalsIgnoreCase("true")) {
            String partnerName = request.getParameter("partnerName");
            keys.add(createSubscriptionIDRedisKey(createdUserRecord, partnerName));
        }

        if (request.getParameter("blockKey") != null && request.getParameter("blockKey").equalsIgnoreCase("true")) {
            String blockType = request.getParameter("blockType");
            keys.add(createblockedUserKey(createdUserRecord, blockType));
        }

        return new ResponseEntity<String>("FORMAT http://localhost:7011/ubs-mock-services/createRedisEntry?dbDetails=localhost:3306:subscription_service:root:root&tableName=user_subscription&colVal=11111111111&colName=msisdn&userKey=true&msisdnKey=true&subKey=true&blockKey=false&cacheServer=localhost:6380&partnerName=partnerNamemera&blockType=BLACKLIST\n SUCCESS " + keys.toString(), HttpStatus.OK);
    }

    public UserSubscriptionTable getUserSubscriptionByUserID(String tableName, String colName, String colval) {
        try {
            String query = "SELECT * FROM " + tableName + " where " + colName + "='" + colval + "'";
            logger.info(query);
            System.out.println();
            return jdbcTemplate.queryForObject(query,
                    new UserSubscriptionMapper());
        } catch (Exception e) {
            logger.info("Error while getting record");
        }
        return null;
    }

    public List<String> creteRedisEntry(UserSubscriptionTable userSub, String partnerName) {
        List<String> redisEntries = new ArrayList<>();

        redisEntries.add(createSubscriptionIDRedisKey(userSub, partnerName));
        redisEntries.add(
                createUserIdRedisKey(userSub.getSubscriptionId(), "" + userSub.getProductId(), userSub.getUserId()));
        redisEntries.add(
                createMsisdnRedisKey(userSub.getSubscriptionId(), "" + userSub.getProductId(), userSub.getMsisdn()));
        return redisEntries;

    }

    public String createSubscriptionIDRedisKey(UserSubscriptionTable userSub, String partnerName) {
        logger.info("Setting Redis Object for subsription id");
        UserSubscriptionDoc userSubRedisObject = new UserSubscriptionDoc();
        try {
            STDateUtils dateUtils = new STDateUtils();

            userSubRedisObject.setSubscriptionId((userSub.getSubscriptionId()));
            userSubRedisObject.setActivationDate((userSub.getActivationDate()));
            userSubRedisObject.setChargedBillingCode(userSub.getChargedBillingCode());
            userSubRedisObject.setChargedPrice(userSub.getChargedPrice());
            userSubRedisObject.setCircleCode(userSub.getCircleCode());
            userSubRedisObject.setCountry(userSub.getCountry());
            userSubRedisObject.setCreatedOn(new Date(dateUtils.convertToLongByUTC(userSub.getCreatedOn())));
            userSubRedisObject.setCurrency(userSub.getCurrency());
            userSubRedisObject.setCustomerTransactionId(userSub.getCustomerTransactionId());

            userSubRedisObject.setEndDate((userSub.getEndDate()));
            userSubRedisObject.setItemId((userSub.getItemId()));
            userSubRedisObject.setItemTypeId((userSub.getItemTypeId()));
            userSubRedisObject.setMode(userSub.getMode());
            userSubRedisObject.setMsisdn(userSub.getMsisdn());
            userSubRedisObject.setNextBillingDate((userSub.getNextBillingDate()));
            userSubRedisObject.setPaid((userSub.isPaid()));
            userSubRedisObject.setPartnerName(partnerName);
            userSubRedisObject.setPartnerId((userSub.getPartnerId()));
            userSubRedisObject.setProductId((userSub.getProductId()));

            userSubRedisObject.setStartDate((userSub.getStartDate()));
            userSubRedisObject.setSubscriptionBillingCode(userSub.getSubscriptionBillingCode());
            userSubRedisObject.setSubscriptionValidityDays((userSub.getSubscriptionValidityDays()));
            userSubRedisObject.setSubscriptionId((userSub.getSubscriptionId()));

            userSubRedisObject.setUserId(userSub.getUserId());
            userSubRedisObject.setUserPreferredLanguage(userSub.getUserPreferredLanguage());
            userSubRedisObject.setUserSource(userSub.getUserSource());

            // it is null, removed from DB and it is not getting used
            userSubRedisObject.setUserSubAuthKey(null);

            userSubRedisObject.setRenewalAllowed((userSub.isRenewalAllowed()));
            userSubRedisObject.setLastChargeDate(userSub.getLastChargedDate());
            userSubRedisObject.setLastUpdatedOn(new Date(dateUtils.convertToLongByUTC(userSub.getLastUpdatedOn())));
            userSubRedisObject.setDeactivationDate((userSub.getDeactivationDate()));

            switch (userSub.getSubscriptionStatus()) {
                case "ACT_INIT":
                    userSubRedisObject.setSubscriptionStatus(SubscriptionStatus.ACT_INIT);
                    break;
                case "ACTIVATED":
                    userSubRedisObject.setSubscriptionStatus(SubscriptionStatus.ACTIVATED);
                    break;
                case "DEACTIVATED":
                    userSubRedisObject.setSubscriptionStatus(SubscriptionStatus.DEACTIVATED);
                    break;
                case "PARKING":
                    userSubRedisObject.setSubscriptionStatus(SubscriptionStatus.PARKING);
                    break;
                case "SUSPEND":
                    userSubRedisObject.setSubscriptionStatus(SubscriptionStatus.SUSPEND);
                    break;
                case "DCT_INIT":
                    userSubRedisObject.setSubscriptionStatus(SubscriptionStatus.DCT_INIT);
                    break;
                default:
//				AppAssert.assertTrue(false, "No match for subscription status");
            }

        } catch (Exception e) {
            e.printStackTrace();
//			AppAssert.assertTrue(false, "Error while creating redis entry object");
        }

        insertKey("" + userSub.getSubscriptionId(), userSubRedisObject);
        return "" + userSub.getSubscriptionId();
    }

    public String createUserIdRedisKey(Long subsId, String productId, String userId) {

        UserKeySubscriptionIdDoc userKeySubscriptionIdDoc = new UserKeySubscriptionIdDoc();
        userKeySubscriptionIdDoc.setSubscriptionId(subsId);

        insertKey("USERID_" + productId + "_" + userId, userKeySubscriptionIdDoc);

        return "USERID_" + productId + "_" + userId;
    }

    public String createMsisdnRedisKey(Long subsId, String productId, String msisdn) {

        UserKeySubscriptionIdDoc userKeySubscriptionIdDoc = new UserKeySubscriptionIdDoc();
        userKeySubscriptionIdDoc.setSubscriptionId(subsId);

        insertKey("MSISDN_" + productId + "_" + msisdn, userKeySubscriptionIdDoc);

        return "MSISDN_" + productId + "_" + msisdn;
    }

    public void insertKey(String key, Object value) {
        logger.info("Insert Key : " + key + ", Value " + value.toString());
        redisTemplateConnection.getRedisConnection().opsForValue().set(key, value);
    }

    public String createblockedUserKey(UserSubscriptionTable createdUserRecord, String blockType) {
        BlockedUser redisBlockUblockData = new BlockedUser();
        redisBlockUblockData.setId(createdUserRecord.getSubscriptionId());
        redisBlockUblockData.setCountry(createdUserRecord.getCountry());
        redisBlockUblockData.setUserId(createdUserRecord.getUserId());
        redisBlockUblockData.setMsisdn(createdUserRecord.getMsisdn());
        redisBlockUblockData.setStartDate(createdUserRecord.getStartDate());
        redisBlockUblockData.setEndDate(createdUserRecord.getEndDate());
        redisBlockUblockData.setPartnerId(createdUserRecord.getPartnerId());
        redisBlockUblockData.setProductId(createdUserRecord.getProductId());
        redisBlockUblockData.setBlockType(blockType);
        String blockedUserKey = "USERID_" + createdUserRecord.getProductId() + "_" + createdUserRecord.getPartnerId()
                + "_" + createdUserRecord.getCountry() + "_" + createdUserRecord.getUserId();
        insertKey(blockedUserKey, redisBlockUblockData);
        return blockedUserKey;
    }
}
