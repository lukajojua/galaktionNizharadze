package com.example.java_galaktion_nizharadze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/gaga";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    private static Connection connection;
    private static Statement statement;

    private  Jdbc() {

    }

    static {

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static Statement getStatement() {
        if(statement == null) {
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return statement;
    }

}
