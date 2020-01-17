/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.fingerprint;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author boluseye
 */
public class GenesysFingerPrint extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Login Page");

        //grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        //namelabel
        Label namelab = new Label("Username");
        GridPane.setConstraints(namelab, 0, 0);

        //nameinput
        TextField nameinput = new TextField();
        nameinput.setPromptText("UserName");
        GridPane.setConstraints(nameinput, 0, 1);

        //passwordlabel
        Label passlab = new Label("Password");
        GridPane.setConstraints(passlab, 0, 1);

        //passwordinput
        TextField passinput = new TextField();
        passinput.setPromptText("Password");
        GridPane.setConstraints(passinput, 0, 1);

        Button loginbtn = new Button("login");
//        loginbtn.setOnAction(e -> isString(passinput, passinput.getText()));
        GridPane.setConstraints(loginbtn, 1, 1);

        VBox layout = new VBox();
        layout.getChildren().addAll(grid,namelab,nameinput,passlab,passinput,loginbtn);
        
        Scene scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }

//    private boolean isString(TextField input, String message){
//        if (isString)
//    }
}
