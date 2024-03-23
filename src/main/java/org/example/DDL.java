package org.example;

import java.util.*;

import java.sql.*;

class DDL {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish connection to the SQLite database
        Connection connection = DriverManager.getConnection("jdbc:sqlite://Users//SandeepGollapudi//Downloads//sqlite-tools-osx-x64-3450200//univ.bd");

        // Create a statement object for executing SQL queries
        Statement statement = connection.createStatement();

        statement.executeUpdate("create table  Temp(a integer, b float)");


        statement.close();
        connection.close();

    }}
