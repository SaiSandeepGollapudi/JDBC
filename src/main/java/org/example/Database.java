package org.example;

import java.sql.*;

class Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish connection to the SQLite database
        Connection connection = DriverManager.getConnection("jdbc:sqlite://Users//SandeepGollapudi//Downloads//sqlite-tools-osx-x64-3450200//univ.bd");

        // Create a statement object for executing SQL queries
        Statement statement = connection.createStatement();

        // Execute the SQL query to retrieve data from the "dept" table
        ResultSet resultSet = statement.executeQuery("select * from dept");

        int departmentNumber;
        String departmentName;

        // Iterate over the result set to retrieve each row of data
        while (resultSet.next()) {
            // Retrieve the "deptno" and "dname" columns from the current row
            departmentNumber = resultSet.getInt("deptno");
            departmentName = resultSet.getString("dname");

            System.out.println(departmentNumber + " " + departmentName);
        }
    }
}
