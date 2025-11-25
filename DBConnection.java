package com.converter.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/university";
    private static final String USER = "root";       // change if needed
    private static final String PASSWORD = "1357924680@Sourabh"; // change if needed

    private static Connection connection;

    // Private constructor to prevent object creation
    private DBConnection() {}

    /**
     * Returns a single shared database connection (Singleton pattern).
     */
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }
}
