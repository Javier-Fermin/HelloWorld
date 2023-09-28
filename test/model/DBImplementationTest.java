/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import resources.ExceptionManager;

/**
 * A test class for the DB implementation
 * @author Javier, Imanol
 */
public class DBImplementationTest {
    
    public DBImplementationTest() {
    }

    /**
     * Test of openConnection method, of class DBImplementation.
     * @throws resources.ExceptionManager
     */
    @Test
    public void testOpenConnection() throws ExceptionManager {
        DBImplementation db = new DBImplementation();
        assertNotNull(db.openConnection());
    }

    /**
     * Test of closeConnection method, of class DBImplementation.
     * @throws resources.ExceptionManager
     * @throws java.sql.SQLException
     */
    @Test
    public void testCloseConnection() throws ExceptionManager, SQLException {
        DBImplementation db = new DBImplementation();
        Connection con = db.openConnection();
        db.closeConnection(con);
        assertTrue(con.isClosed());
    }

    /**
     * Test of getGreeting method, of class DBImplementation.
     */
    @Test
    public void testGetGreeting() throws ExceptionManager {
        DBImplementation db = new DBImplementation();
        assertEquals("Hello World!", db.getGreeting());
    }
    
    
    
    /**
     * Test of openConnection method, of class DBImplementation.
     * @throws resources.ExceptionManager
     */
    @Test(expected = ExceptionManager.class)
    public void testOpenConnectionException() throws ExceptionManager {
        DBImplementation db = new DBImplementation();
        assertNotNull(db.openConnection());
    }

    /**
     * Test of closeConnection method, of class DBImplementation.
     * @throws resources.ExceptionManager
     * @throws java.sql.SQLException
     */
    @Test(expected = ExceptionManager.class)
    public void testCloseConnectionException() throws ExceptionManager, SQLException {
        DBImplementation db = new DBImplementation();
        Connection con = db.openConnection();
        db.closeConnection(con);
        assertTrue(con.isClosed());
    }

    /**
     * Test of getGreeting method, of class DBImplementation.
     * @throws resources.ExceptionManager
     */
    @Test(expected = ExceptionManager.class)
    public void testGetGreetingException() throws ExceptionManager {
        DBImplementation db = new DBImplementation();
        assertEquals("Hello World!", db.getGreeting());
    }
}
