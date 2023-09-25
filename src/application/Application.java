/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import model.ModelFactory;
import view.ViewFactory;

/**
 * The main application for the Hello World challenge
 * @author Javier, Imanol
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Controller().run(ViewFactory.getView(), ModelFactory.getModel());
    }
}
