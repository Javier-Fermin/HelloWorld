/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 * This is the personalized exception that is used to manage the exceptions that
 * may occur during the program
 * 
 * @author Javier
 */
public class ExceptionManager extends Exception{
    public ExceptionManager() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ExceptionManager(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public ExceptionManager(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public ExceptionManager(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public ExceptionManager(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }
}
