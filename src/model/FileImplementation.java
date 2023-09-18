/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * This class is a model implementation that is designed to get data from a properties file
 * 
 * @author Imanol
 */
public class FileImplementation implements Model {
    
    /**
     * This method gets the greeting that is in the properties file
     * 
     * @return the desired message in the properties field
     */
    @Override
    public String getGreeting() {
        return ResourceBundle.getBundle("Resources.Config").getString("GREETING");
    }

}
