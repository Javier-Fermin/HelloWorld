/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * This class is a factory class that is in charge to create Model related objects
 * @author Imanol
 */
public class ModelFactory {
    
    /**
     * This method returns an object according to the config file 
     * stablished parameters, in case of a non supported option being defined in
     * the config file it will return by default a FileImplementation
     * 
     * @return returns a new FileImplementation or DBImplementation object
     */
    public static Model getModel() {
        if(Integer.parseInt(ResourceBundle.getBundle("resources.Config").getString("MODEL"))==1){
            return new DBImplementation();
        }else{
            return new FileImplementation();
        }
    }
}
