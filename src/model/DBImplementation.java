/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class gets the data from the DB 
 * @author Imanol
 */
public class DBImplementation implements Model {
    private Connection con;
    private PreparedStatement ptmt;
    private ResultSet rs;
    
    /**
     * This method opens a connection against the DB
     * @return conn
     */
    public Connection openConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    //gets the info from the config file to log into the DB
                    ResourceBundle.getBundle("resources.Config").getString("URL"),
                    ResourceBundle.getBundle("resources.Config").getString("USER"),
                    ResourceBundle.getBundle("resources.Config").getString("PASSWORD")
            );
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DBImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    /*
    *This method closes the current DB connection
    *@return
    */
    public void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                //closes the connection
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBImplementation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    /*
    *This method gets the greeting from the DB
    *@return greeting
    */
    @Override
    public String getGreeting() {
        String greeting = null;
        con = openConnection();
        
        try {
            //gets the hello world message
            ptmt = con.prepareStatement("SELECT * FROM Messages WHERE message = 'Hello World!';");
            rs = ptmt.executeQuery();
            while(rs.next()){
                greeting = rs.getString("message");
            }
            rs.close();
            ptmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection(con);
        return greeting;
    }

}
