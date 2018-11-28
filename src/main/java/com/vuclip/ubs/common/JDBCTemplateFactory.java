package com.vuclip.ubs.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCTemplateFactory {

    private static Logger logger = LogManager.getLogger(JDBCTemplateFactory.class);

    private JDBCTemplateFactory() {
    }

    public static JdbcTemplate getDbConnection(String dbServer, String dbPort, String dbName, String dbUser,
                                               String bPassword) {
        JdbcTemplate jDBCTemplate = null;
        try {
            String dbUrl = "jdbc:mysql://" + dbServer + ":" + dbPort + "/" + dbName + "?useSSL=false";
            logger.info("Databse URL: " + dbUrl);
            DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setUrl(dbUrl);
            ds.setUsername(dbUser);
            ds.setPassword(bPassword);
            jDBCTemplate = new JdbcTemplate(ds);
            logger.info("Connection created to: " + dbUrl);
        } catch (Exception e) {
            logger.info(e);
            logger.info("Exception in getting DBConnection: " + e.getMessage());
        }

        return jDBCTemplate;
    }

}
