package com.vuclip.ubs.utils;

import com.paytm.merchant.CheckSumServiceHelper;
import com.vuclip.ubs.common.InitializeDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class PaytmChecksumUtils {
	public static final String CHECKSUM_STRING_DELIMITER = "|";
	public static final String IS_CHECKSUM_VALID = "IS_CHECKSUM_VALID";
	public static final String PROMO_RESPCODE = "PROMO_RESPCODE";
	public static final String PROMO_STATUS = "PROMO_STATUS";
	public static final String PROMO_CAMP_ID = "PROMO_CAMP_ID";
	public static final String PAYMENTMODE = "PAYMENTMODE";
	public static final String BANKNAME = "BANKNAME";
	public static final String GATEWAYNAME = "GATEWAYNAME";
	public static final String STATUS = "STATUS";
	public static final String BANKTXNID = "BANKTXNID";
	public static final String TXNID = "TXNID";
	public static final String TXNDATE = "TXNDATE";
	public static final String RESPCODE = "RESPCODE";
	public static final String CURRENCY = "CURRENCY";
	public static final String ORDERID = "ORDERID";
	public static final String TXNAMOUNT = "TXNAMOUNT";
	public static final String MID = "MID";
	public static final String SUBS_ID = "SUBS_ID";
	public static final String TXNTYPE = "TXNTYPE";
	public static final String RESPMSG = "RESPMSG";
	public static final String REFUNDAMT = "REFUNDAMT";
	private static Logger logger = LogManager.getLogger(PaytmChecksumUtils.class);

	public static TreeMap<String, String> getChecksumParametersMap(Map<String, String> parameters) {
		TreeMap<String, String> paramap = new TreeMap<>();

		paramap.put(SUBS_ID, parameters.get(SUBS_ID));
		paramap.put(MID, parameters.get(MID));
		paramap.put(TXNID, parameters.get(TXNID));
		paramap.put(ORDERID, parameters.get(ORDERID));
		paramap.put(BANKTXNID, parameters.get(BANKTXNID));
		paramap.put(TXNAMOUNT, parameters.get(TXNAMOUNT));
		paramap.put(CURRENCY, parameters.get(CURRENCY));
		paramap.put(STATUS, parameters.get(STATUS));
		paramap.put(RESPCODE, parameters.get(RESPCODE));
		paramap.put(RESPMSG, parameters.get(RESPMSG));
		paramap.put(TXNDATE, parameters.get(TXNDATE));
		paramap.put(GATEWAYNAME, parameters.get(GATEWAYNAME));
		paramap.put(BANKNAME, parameters.get(BANKNAME));
		paramap.put(PAYMENTMODE, parameters.get(PAYMENTMODE));
		paramap.put(PROMO_CAMP_ID, parameters.get(PROMO_CAMP_ID));
		paramap.put(PROMO_STATUS, parameters.get(PROMO_STATUS));
		paramap.put(PROMO_RESPCODE, parameters.get(PROMO_RESPCODE));
		paramap.values().removeIf(Objects::isNull);

		return paramap;
	}

	public static String getChecksum(TreeMap<String, String> parameters) {

		CheckSumServiceHelper checkSumServiceHelper = CheckSumServiceHelper.getCheckSumServiceHelper();
		String checkSum = null;
		try {

			checkSum = checkSumServiceHelper.genrateCheckSum("_MIo%_T%p3a3Ilri", parameters);
		} catch (Exception e) {
			logger.info("=========================Exception while generating Paytm checksum" + e);
		}

		return checkSum;

	}

	public String getUserId(String orderId) {

		logger.info("Fetching  UserId from  Partner Txn MAP table for " + orderId);
		InitializeDB initidb = new InitializeDB();
		initidb.init();
		DBHelper dBHelper = new DBHelper();
		String userId = dBHelper.getUserIdfromPartnerTxnMap(orderId);
		logger.info("UserId Fetched : " + userId);

		return userId;

	}


}

