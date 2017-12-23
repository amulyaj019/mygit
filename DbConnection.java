/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    static Connection con;
     public static Connection getConnection()
     {
         try{

Class.forName("com.mysql.jdbc.Driver");
   
    con = DriverManager.getConnection("jdbc:mysql://localhost:1234/financialmanagement", "root", "root");
      
                System.out.println(con);
        
                        }
      catch(Exception e)
      {
          System.out.println(e);
            
          e.printStackTrace();
      }
         return con;
      
             
}
}
