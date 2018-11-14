package com.vuclip.ubs.common;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCTemplateFactory {


    private JDBCTemplateFactory() {
    }

    public static JdbcTemplate getDbConnection(String dbServer, String dbPort, String dbName, String dbUser,
                                               String bPassword) {
        JdbcTemplate jDBCTemplate = null;
        try {
            String dbUrl = "jdbc:mysql://" + dbServer + ":" + dbPort + "/" + dbName + "";
            System.out.println("Databse URL: " + dbUrl);
            DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setUrl(dbUrl);
            ds.setUsername(dbUser);
            ds.setPassword(bPassword);
            jDBCTemplate = new JdbcTemplate(ds);
            System.out.println("Connection created to: " + dbUrl);
        } catch (Exception e) {
            System.out.println("Exception in getting DBConnection: " + e.getMessage());
            return null;
        }

        return jDBCTemplate;
    }

}
