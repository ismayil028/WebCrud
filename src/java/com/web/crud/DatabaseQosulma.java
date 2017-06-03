package com.web.crud;

import java.sql.*;

public class DatabaseQosulma {

    static String url = "jdbc:mysql://localhost:3306/mydata";
    static String username = "root";
    static String password = "root";
    static String classname = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println(con);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return c;

    }

    public static Statement getStatement() {
        Statement stmt = null;
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return stmt;
    }

    public static PreparedStatement getPreparedStatement(String query) {
        PreparedStatement ps = null;
        try {
            Class.forName(classname);
            Connection con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return ps;

    }
}
