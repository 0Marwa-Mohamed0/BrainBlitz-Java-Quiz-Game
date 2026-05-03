package com.quiz.project.quizapp;

import java.sql.*;


public class DBConnection {
   static final String url = "jdbc:mysql://localhost:3306/quizapp";
   static final String user = "root";
   static final String pass = "";
   
   public static Connection connect () {
       try {
           Connection c = DriverManager.getConnection(url, user, pass);
           System.out.println("Connected to database");
           return c;
       }
       catch (SQLException e){
           System.out.println("Connection was not established" + e.getMessage());
       
           return null;
       }
   }
    
}
