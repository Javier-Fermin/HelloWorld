/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * This class is a view implementation that is created to show a greeting in the console
 * 
 * @author Javier
 */
public class TextViewImplementation implements View{

    /**
     * This method is the responsible of showing the greeting in the console
     * 
     * It recieves a param that is the message that has to be shown
     * @param greeting 
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
