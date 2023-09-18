/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 * This class is a factory class that is responsible to create view implementations
 * 
 * @author Javier
 */
public class ViewFactory {
    
    /**
     * This method creates a view implementation in function of a parameter inside the 
     * properties file, this parameter should be binary, meaning that its possibles values should be only 1 or 0
     * 
     * @return the created view implementation 
     */
    public static View getView() {
        if (Integer.parseInt(ResourceBundle.getBundle("Resources.Config").getString("VIEW")) == 0) {
            return new TextViewImplementation();
        } else {
            return new WindowViewImplementation();
        }
    }
}
