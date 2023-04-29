package com.example.login;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Drive ");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/uiu cafeteria","root"," ");
            return connect;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        }
    }

