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
 *
 * @author
 */
public class DBImplementation implements Model {
    private Connection con;
    private PreparedStatement ptmt;
    private ResultSet rs;
    public Connection openConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
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

    public void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBImplementation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public String getGreeting() {
        String greeting = null;
        con = openConnection();
        
        try {
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
