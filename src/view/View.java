/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * This interface is the one related to the view
 * 
 * @author Javier
 */
public interface View {
    
    /**
     * This is a method that should show the greeting in the respective view, it recieves the desired greeting in the parameter
     * 
     * @param greeting 
     */
    public void showGreeting (String greeting);
}
