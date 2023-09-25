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
        switch(Integer.parseInt(ResourceBundle.getBundle("resources.Config").getString("MODEL"))){
            case 1:
                return new DBImplementation();
            case 0:
                return new FileImplementation();
            default:
                return null;
        }
    }
}
