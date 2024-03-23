package org.example;

import java.util.*;

import java.sql.*;
public class Database2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            Class.forName("org.sqlite.JDBC");

            con = DriverManager.getConnection("jdbc:sqlite://Users//SandeepGollapudi//Downloads//sqlite-tools-osx-x64-3450200//univ.bd");

            stm = con.prepareStatement("select * from students where deptno=?");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Department Number: ");
            int dno = sc.nextInt();

            stm.setInt(1, dno);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getInt("roll") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getString("city") + " ");
                System.out.println(rs.getInt(4));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}