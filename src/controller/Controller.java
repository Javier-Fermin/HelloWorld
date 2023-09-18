/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.View;
import model.Model;

/**
 * This class is made to connect both the view and the model
 * 
 * @author Javier
 */
public class Controller {
    
    /**
     * This method is in charge of getting the greeting from the model and to show it in the view
     * 
     */
    public void run(View view,Model model){
        view.showGreeting(model.getGreeting());
    }
}
