package com.flightbooking.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://your-aws-endpoint:3306/flight_db";
    private static final String USER = "admin";
    private static final String PASSWORD = "your-password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
