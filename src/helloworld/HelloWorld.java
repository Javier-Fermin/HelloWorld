/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import controller.Controller;
import model.ModelFactory;
import view.ViewFactory;
import view.View;
import model.Model;

/**
 *
 * @author javie
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Controller().run(ViewFactory.getView(), ModelFactory.getModel());
    }
    
}
