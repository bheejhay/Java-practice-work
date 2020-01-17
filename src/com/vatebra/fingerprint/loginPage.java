/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.fingerprint;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author boluseye
 */
public class loginPage {
    
    Stage window;
    
    public static void display(String title, String message) {
        Stage window = new Stage();
        window.setTitle("Patient ID Number");
        window.setMinWidth(300);

        // grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(15);
        grid.setHgap(10);

        
        //id label
        Label idlabel = new Label("Patient Id:");
        GridPane.setConstraints(idlabel, 0, 0);
        
        //id inputs
        TextField idinput = new TextField();
        idinput.setPromptText("input id num");
        GridPane.setConstraints(idinput, 0, 1);
        
        // button
        Button submitbtn = new Button("Submit");
        submitbtn.setOnAction(e -> );
        
    }
    
}
