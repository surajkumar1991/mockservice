package com.vuclip.ubs.utils;

import com.vuclip.ubs.common.Context;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class DBUtils {


	/**
	 * @param jdbcTemplate
	 * @param tableName
	 * @param whereClause
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getRecord(JdbcTemplate jdbcTemplate, String tableName, String whereClause) {
		String query = prepareSelectQuery(tableName, whereClause, "*");

		System.out.println("Query for PartnerTransactionMap:" + query);
		try {
			Map<String, Object> record = jdbcTemplate.queryForMap(query);
			Context.get().getDbLogger().info(record.toString());
			if (!record.isEmpty()) {
				Context.get().getDbLogger().info("Inside If block");
				Context.get().getDbLogger().info(record.toString());
				return record;
			}
		} catch (Exception ex) {
			Context.get().getDbLogger().info("Error while getting record");
		}
		return null;
	}


	/**
	 * @param jdbcTemplate
	 * @param tableName
	 * @param whereClause
	 * @param fieldName
	 * @return
	 */
	public String getFieldValue(JdbcTemplate jdbcTemplate, String tableName, String whereClause, String fieldName) {
		try {
			Map<String, Object> record = getRecord(jdbcTemplate, tableName, whereClause);
			if (record != null) {
				Context.get().getDbLogger()
						.info("Get Field Value : " + fieldName + " = " + record.get(fieldName).toString());
				return record.get(fieldName).toString();
			}
		} catch (Exception e) {
			Context.get().getDbLogger().info("Error getting field value");
		}

		return null;
	}


	private String prepareSelectQuery(String tableName, String whereClause, String rows) {
		String query = "select " + rows + " from " + tableName;
		if (whereClause != null && !whereClause.isEmpty())
			query += " where " + whereClause;
		Context.get().getDbLogger().info("QUERY : " + query);

		return query;

	}


}