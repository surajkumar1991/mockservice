package com.vuclip.ubs.controller;

import com.vuclip.ubs.common.ObjectMapperUtils;
import com.vuclip.ubs.models.subscription_service.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
public class SubscriptionServiceControllers {

    private Logger logger = LogManager.getLogger(SubscriptionServiceControllers.class);

    @Autowired(required = true)
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/getUserStatus/{productId}", method = RequestMethod.GET, produces = "application/json")
    public SubscriptionStatusReponse sgetSubscriptionStatus(@PathVariable Integer productId,
                                                            @RequestParam(required = false) String userid, @RequestParam(required = false) String msisdn,
                                                            @RequestParam(required = false) Long subscriptionId) {
        logger.info("GETUSERSTATUS REQUEST PARAM : " + userid + msisdn + subscriptionId + productId);

        if (userid != null) {
            String query = "SELECT * FROM user_subscription where user_id='" + userid + "'";
            return getUserSubscriptionRecord(query);
        }
        if (msisdn != null) {
            String query = "SELECT * FROM user_subscription where msisdn='" + msisdn + "'";
            return getUserSubscriptionRecord(query);
        }
        if (subscriptionId != null) {
            String query = "SELECT * FROM user_subscription where subscription_id=" + subscriptionId;
            return getUserSubscriptionRecord(query);
        }
        return new SubscriptionStatusReponse(false, "Data is not valid", "FA004", null);

    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST, produces = "application/json")
    public ConfirmResponseVO confirm(@RequestBody ConfirmRequestVO confirmRequestVO) {

        logger.info("Got request for update a subscription : {}", confirmRequestVO);

        String userid = confirmRequestVO.getUserId();

        ConfirmResponseVO response = null;


        if (userid != null) {
            String query = "SELECT * FROM confirm where user_id='" + userid + "'";
            return getConfirmRecord(query);
        }

        return new ConfirmResponseVO(false, "Data is not valid", "FA004", null);


//    	Object jsonval = "{\"successful\":true,\"message\":\"success\",\"responseCode\":\"200\",\"userStatus\":{\"userSubAuthKey\":null,\"userId\":\"1100000000\",\"msisdn\":null,\"subscriptionId\":6756,\"startDate\":1543478476420,\"endDate\":1543651276000,\"nextBillingDate\":1543564876000,\"lastChargeDate\":null,\"chargedPrice\":0.0,\"country\":\"IN\",\"partnerId\":1,\"subscriptionStatus\":\"ACT_INIT\",\"subscriptionValidityDays\":1,\"productId\":1,\"itemId\":0,\"itemTypeId\":0,\"subscriptionBillingCode\":\"b1\",\"chargedBillingCode\":\"b1\",\"customerTransactionId\":\"IM0WJ1USEMVRY\",\"renewalAllowed\":true,\"activationDate\":null,\"deactivationDate\":0,\"payload\":null,\"summary\":\"ACTIVATION_IN_PROGRESS\",\"mode\":null,\"paid\":false,\"userSource\":null,\"partnerName\":\"PayPal\",\"currency\":\"INR\",\"displayRenewalConsent\":false}}";
//    	
//    	
//    	response = ObjectMapperUtils.readValueFromString((String) jsonval, ConfirmResponseVO.class);
//        
//    	
//		logger.info("Update subscription response: {}", response);
        //return response;
    }

    @RequestMapping(value = "/check/freeTrialEligibility", method = RequestMethod.GET, produces = "application/json")
    public FreeTrialEligibilityResponseVO checkFreeTrialEligibility(
            FreeTrialEligibilityRequestVO freeTrialEligibilityRequestVO) {
        String userid = freeTrialEligibilityRequestVO.getUserId();
        String msisdn = freeTrialEligibilityRequestVO.getMsisdn();
        String country = freeTrialEligibilityRequestVO.getCountry();

        if (userid == null && msisdn == null) {
            return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
                    .response(new Response("UserId or Msisdn is required", false, "200")).build();
        }

        if (country == null) {
            return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
                    .response(new Response("Country is required", false, "200")).build();
        }

        if (userid != null) {
            String query = "SELECT * FROM ubs_mock_services.free_trial_history where user_id='" + userid + "'";
            return getFreeTrialRecords(query);
        }
        if (msisdn != null) {
            String query = "SELECT * FROM ubs_mock_services.free_trial_history where msisdn='" + msisdn + "'";
            return getFreeTrialRecords(query);
        }

        return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(false)
                .response(new Response("No message available", false, "500")).build();

    }


    @RequestMapping(value = "/blockStatus", method = RequestMethod.GET, produces = "application/json")
    public BlockStatusResponseVO blockStatus(@Valid BlockStatusRequestVO blockStatusRequestVO) {
        logger.info("block status request : {}", blockStatusRequestVO);

        String userid = blockStatusRequestVO.getUserId();
        String msisdn = blockStatusRequestVO.getMsisdn();

        if (userid != null) {
            String query = "SELECT * FROM block_status where user_id='" + userid + "'";
            return getBlockStatusRecords(query);
        }
        if (msisdn != null) {
            String query = "SELECT * FROM block_status where msisdn='" + msisdn + "'";
            return getBlockStatusRecords(query);
        }
        return BlockStatusResponseVO.builder().blockedUserData(null).blockSummary(StatusSummary.BLACK_LISTED).build();
    }

    @RequestMapping(value = "/block", method = RequestMethod.POST, produces = "application/json")
    public BlockUserResponseVO block(@Valid @RequestBody BlockUserRequestVO blockUserRequestVO) {
        logger.info("block request : {}", blockUserRequestVO);

        String userid = blockUserRequestVO.getUserDetails().getUserId();
        String msisdn = blockUserRequestVO.getUserDetails().getMsisdn();

        if (userid != null) {
            String query = "SELECT * FROM block where user_id='" + userid + "'";
            return getBlockRecords(query);
        }
        if (msisdn != null) {
            String query = "SELECT * FROM block where msisdn='" + msisdn + "'";
            return getBlockRecords(query);
        }
        return BlockUserResponseVO.builder().blockedUserData(null).response(new Response("SUCCESS", true, "200"))
                .build();

    }

    @RequestMapping(value = "/unblock", method = RequestMethod.POST, produces = "application/json")
    public UnblockResponseVO unblock(@Valid @RequestBody UnblockRequestVO unblockRequestVO) {
        logger.info("unblock request : {}", unblockRequestVO);
        String userid = unblockRequestVO.getUserId();
        String msisdn = unblockRequestVO.getUserId();

        if (userid != null) {
            String query = "SELECT * FROM unblock where user_id='" + userid + "'";
            return getUnblockRecords(query);
        }
        if (msisdn != null) {
            String query = "SELECT * FROM unblock where msisdn='" + msisdn + "'";
            return getUnblockRecords(query);
        }
        return UnblockResponseVO.builder().response(new Response("FAILURE", true, "200")).build();
    }

    @RequestMapping(value = "/deactivate", method = RequestMethod.POST, produces = "application/json")
    public DeactivateUserResponseVO deactivate(@RequestBody DeactivateRequestVO deactivateRequestVO) {
        logger.info("Got request for deactivate: {}", deactivateRequestVO);

        String userid = deactivateRequestVO.getUserId();
        String msisdn = deactivateRequestVO.getMsisdn();

        if (userid != null) {
            String query = "SELECT * FROM deactivate where user_id='" + userid + "'";
            return getDeactivateRecords(query);
        }
        if (msisdn != null) {
            String query = "SELECT * FROM deactivate where msisdn='" + msisdn + "'";
            return getDeactivateRecords(query);
        }
        return DeactivateUserResponseVO.builder().status(null).build();

    }

    private DeactivateUserResponseVO getDeactivateRecords(String query) {
        try {
            logger.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                Object jsonval = respon.get(0).get("json");
                logger.info(jsonval);
                DeactivateUserResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
                        DeactivateUserResponseVO.class);
                return response;
            }
        } catch (Exception e) {
            logger.info("No REcord found" + e);

        }
        return DeactivateUserResponseVO.builder().status(null).build();
    }

    private BlockUserResponseVO getBlockRecords(String query) {
        try {
            logger.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                Object jsonval = respon.get(0).get("json");
                logger.info(jsonval);
                BlockUserResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
                        BlockUserResponseVO.class);
                return response;
            }
        } catch (Exception e) {
            logger.info("No REcord found" + e);
            return BlockUserResponseVO.builder().blockedUserData(null).response(new Response("SUCCESS", true, "200"))
                    .build();

        }
        return BlockUserResponseVO.builder().blockedUserData(null).response(new Response("SUCCESS", true, "200"))
                .build();
    }

    private BlockStatusResponseVO getBlockStatusRecords(String query) {
        try {
            logger.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                Object jsonval = respon.get(0).get("json");
                logger.info(jsonval);
                BlockStatusResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
                        BlockStatusResponseVO.class);
                return response;
            }
        } catch (Exception e) {
            logger.info("No Record found" + e);
            return BlockStatusResponseVO.builder().blockedUserData(null).blockSummary(StatusSummary.NOT_BLACKLISTED)
                    .build();

        }
        return BlockStatusResponseVO.builder().blockedUserData(null).blockSummary(StatusSummary.NOT_BLACKLISTED)
                .build();
    }

    private UnblockResponseVO getUnblockRecords(String query) {
        try {
            logger.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                Object jsonval = respon.get(0).get("json");
                logger.info(jsonval);
                UnblockResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
                        UnblockResponseVO.class);
                return response;
            }
        } catch (Exception e) {
            logger.info("No Record found" + e);
            return UnblockResponseVO.builder().response(new Response("FAILURE", true, "200")).build();

        }
        return UnblockResponseVO.builder().response(new Response("Not Blacklisted", true, "AB015")).build();
    }

    private FreeTrialEligibilityResponseVO getFreeTrialRecords(String query) {
        try {
            logger.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                Object jsonval = respon.get(0).get("json");
                logger.info(jsonval);
                FreeTrialEligibilityResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
                        FreeTrialEligibilityResponseVO.class);
                return response;
            }
        } catch (Exception e) {
            logger.info("Excpetion:" + e);
            return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(true)
                    .response(new Response("faiure", false, "200")).build();

        }
        logger.info("Free Trial New User");
        return FreeTrialEligibilityResponseVO.builder().freeTrialEligibility(true)
                .response(new Response("SUCCESS", true, "200")).build();

    }

    private SubscriptionStatusReponse getUserSubscriptionRecord(String query) {
        try {
            logger.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                Object jsonval = respon.get(0).get("json");
                logger.info(jsonval);
                SubscriptionStatusReponse response = ObjectMapperUtils.readValueFromString((String) jsonval,
                        SubscriptionStatusReponse.class);
                logger.info("RESPONSE " + response.toString());

                return response;
            }
        } catch (Exception e) {
            logger.info("Excpetion:" + e);
            return new SubscriptionStatusReponse(false, "Data is not valid", "FA004", null);

        }
        logger.info("User Status New User");
        return new SubscriptionStatusReponse(true, "success", "200", null);
    }

    private ConfirmResponseVO getConfirmRecord(String query) {
        try {
            logger.info("QUERY FOR FETCHING DATA " + query);
            List<Map<String, Object>> respon = jdbcTemplate.queryForList(query);
            if (respon.size() >= 1) {
                Object jsonval = respon.get(0).get("json");
                logger.info(jsonval);
                ConfirmResponseVO response = ObjectMapperUtils.readValueFromString((String) jsonval,
                        ConfirmResponseVO.class);
                logger.info("RESPONSE " + response.toString());

                return response;
            }
        } catch (Exception e) {
            logger.info("Excpetion:" + e);
            return new ConfirmResponseVO(false, "Request Not Processed", "FA004", null);

        }
        return null;
    }


}
