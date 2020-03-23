/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author hp
 */
class MysqlConnect {
    Connection conn=null;
     public static Connection ConnectDB() throws SQLException{
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/review?zeroDateTimeBehavior=convertToNull ","root","");
             JOptionPane.showMessageDialog(null,"Connected to database");
             return conn;
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MYSQLCONN.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
             return null;
           }
     }
    
}
