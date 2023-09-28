/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A test class for the file implementation
 * @author Javier
 */
public class FileImplementationTest {
    
    public FileImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class FileImplementation.
     */
    @Test
    public void testGetGreeting() {
        FileImplementation file = new FileImplementation();
        assertEquals("Hello World!", file.getGreeting());
    }
    
}
