package com.vti.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
    public static Connection databaseLink;
    public JdbcUtils() throws Exception {
        databaseLink = ConnectDatabase.getConnection();
    }
    public void isConnectedForTesting() throws Exception {
        Connection connection = ConnectDatabase.getConnection();
        try {
            if (connection != null) {
                System.out.println("Connect success!");
            }
        } catch (Exception e) {
                throw new Exception("Connect failed!");
        }
    }


    public void connect() throws Exception {
        if (databaseLink != null || databaseLink.isClosed()) {
            String url = "jdbc:mysql://localhost/company_management";
            String databaseUser = "root";
            String databasePassword = "Dangquochuy24982765@";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
            } catch (Exception e) {
                throw new Exception("Cannot connect database!", e);
            }
        }

    }

    public void disconnect() throws Exception {
        try {
            if (databaseLink != null && !databaseLink.isClosed()) {
                databaseLink.close();
            }
        } catch (Exception e) {
            throw new Exception("Cannot disconnect database!", e);
        }
    }

}
