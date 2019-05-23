package com.vuclip.ubs.common;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

/**
 * @author Akhilesh
 */
public final class Components {

	private static JdbcTemplate partnerServiceDBConnection;



	public static JdbcTemplate getPartnerServiceDBConnection() {
		if (partnerServiceDBConnection == null) {
			partnerServiceDBConnection = JDBCTemplateFactory.getDbConnection(Configuration.pldbServer,
					Configuration.pldbPort, Configuration.pldbName, Configuration.pldbUser, Configuration.pldbPassword);
		}
		return partnerServiceDBConnection;
	}


	public static void closeConnection(JdbcTemplate connection) {
		try {
			if (connection != null && connection.getDataSource() != null)
				if (connection.getDataSource().getConnection() != null)
					if (!connection.getDataSource().getConnection().isClosed()) {
						Context.get().getCommonLogger().info("==========closing Database Connection==============");
						connection.getDataSource().getConnection().close();
					}
		} catch (SQLException e) {
			Context.get().getCommonLogger().info("Error while closing Database Connection" + e.getMessage());
		}
	}
	}

