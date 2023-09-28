/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import resources.ExceptionManager;

/**
 *This is an interface that is related to the Model
 * @author Imanol
 */
public interface Model {
    /*
    * This method returns a greeting
    */
    public String getGreeting() throws ExceptionManager;
}
