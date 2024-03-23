package org.example;

import java.sql.*;

class DatabaseStudents {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish connection to the SQLite database
        Connection connection = DriverManager.getConnection("jdbc:sqlite://Users//SandeepGollapudi//Downloads//sqlite-tools-osx-x64-3450200//univ.bd");

        // Create a statement object for executing SQL queries
        Statement statement = connection.createStatement();

        // Execute the SQL query to retrieve data from the "dept" table
        ResultSet resultSet = statement.executeQuery("select * from students");


        // Iterate over the result set to retrieve each row of data
        while (resultSet.next()) {

            System.out.print(resultSet.getInt("roll") + " ");
            System.out.print(resultSet.getString("name") + " ");
            System.out.print(resultSet.getString("city") + " ");
            System.out.println(resultSet.getInt(4) + " ");


        }
        statement.close();
        connection.close();
    }
}
