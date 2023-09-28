/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.View;
import model.Model;
import resources.ExceptionManager;

/**
 * This class is made to connect both the view and the model
 * 
 * @author Javier
 */
public class Controller {
    
    /**
     * This method is in charge of getting the greeting from the model and to show it in the view
     * 
     * @param view
     * @param model
     */
    public void run(View view,Model model){
        try {
            view.showGreeting(model.getGreeting());
        } catch (ExceptionManager ex) {
            view.showGreeting(ex.getMessage());
        }
    }
}
