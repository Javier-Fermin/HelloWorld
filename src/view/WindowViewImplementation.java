/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author javie
 */
public class WindowViewImplementation extends javafx.application.Application implements View,Initializable{

    @FXML
    private Label label;
    private String greeting;
    
    @Override
    public void showGreeting(String greeting) {
        //Stage stage = new Stage();
        try {
            String[] args = new String[1];
            args[0] = greeting;
            launch(args);
            
        } catch (Exception ex) {
            Logger.getLogger(WindowViewImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Parent root = loader.load();
        WindowViewImplementation controller = loader.getController();
        controller.setGreeting(getParameters().getRaw().get(0));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.showAndWait();
    }

    
    public void setGreeting(String greeting){
        label.setText(greeting);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO
    }
    
}
