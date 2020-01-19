/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goodshephard.school.util;

import java.sql. * ;

/**
 *
 * @author USER
 */
public class DButil {
    public static final String URl = "jdbc:mysql://localhost:3306/schooldb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    public static Connection getConnection(){
        
        Connection conn = null;
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("JDBC Driver Found");
        }catch(ClassNotFoundException cf){
            cf.printStackTrace();
            System.out.println("JDBC Driver not found");
        }
        
        try{
            conn = DriverManager.getConnection(URl, USERNAME, PASSWORD);
            System.out.println("successfully connected");
        }catch(SQLException sq){
            sq.printStackTrace();
            System.out.println("Database Connected Successfully");
        }
        return conn;
        
    }
    
//    public static void main(String[] args) {
//        System.out.println(getConnection());
//    }
}
