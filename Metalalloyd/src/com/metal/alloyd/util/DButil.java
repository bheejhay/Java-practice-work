/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metal.alloyd.util;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DButil {

    public static final String URL = "jdbc:mysql://localhost:3306/metalalloydb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getconnection() {

        Connection cont = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Driver has been found");
        } catch (ClassNotFoundException cf) {
            cf.printStackTrace();
            System.out.println("JDBC_DRIVER not Found");
        }

        try {
            cont = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Successfully Connected");
        } catch (SQLException sq) {
            sq.printStackTrace();
            System.out.println("SQL  not yet connected");
        }
        return cont;
    }
//    public static void main(String[] args) {
//        System.out.println(getconnection());
//        
//    }
}
