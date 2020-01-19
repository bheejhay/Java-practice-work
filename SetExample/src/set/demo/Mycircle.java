/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.demo;

import javafx.scene.shape.Circle;

/**
 *
 * @author USER
 */
public class Mycircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Circle mycircle = new Circle (5.0);
        int n = 5;
//        print(mycircle, n);
        
        System.out.println("\n"+ "Radius is "+ mycircle.getRadius());
        System.out.println("n is "+ n);

    }

}


