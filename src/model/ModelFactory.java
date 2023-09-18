/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *This class is a factory class that is in charge to create Model related objects
 * @author Imanol
 */
public class ModelFactory {
    
    /**
     * This method returns an object according to the config file stablished parameters
     * @return returns a new FileImplementation or DBImplementation object
     */
    public static Model getModel() {
        if (Integer.parseInt(ResourceBundle.getBundle("Resources.Config").getString("MODEL")) == 0) {
            return new FileImplementation();
        } else {
            return new DBImplementation();
        }
    }
}
