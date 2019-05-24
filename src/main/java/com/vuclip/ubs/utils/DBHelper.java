package com.vuclip.ubs.utils;

import com.vuclip.ubs.common.Components;

public class DBHelper {

	private DBUtils dBUtils;

	public DBHelper() {

		dBUtils = new DBUtils();
	}



	/**
	 * @param orderId
	 * @return
	 */
	public String getUserIdfromPartnerTxnMap(String orderId) {
		String userid = dBUtils.getFieldValue(Components.getPartnerServiceDBConnection(),
				"partner_request_transaction_map",
				"partner_transaction_id=" + orderId , "user_id");

		Components.closeConnection(Components.getPartnerServiceDBConnection());


		return userid;
	}



}
