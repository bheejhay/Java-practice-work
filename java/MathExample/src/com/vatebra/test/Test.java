/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.test;

import com.vatebra.math.Maximum;
import com.vatebra.math.Square;
import com.vatebra.math.SquareRoot;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        display();
    }

    public static void display() {
        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose any option");
        System.out.println("1. Power");
        System.out.println("2. Square root");
        System.out.println("3. Maximum");
        System.out.println("4. Exit");

        System.out.println("enter option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                Square.answer();
                break;
            case 2:
                SquareRoot.displayAnswer();
                break;
            case 3:
                Maximum.maximum();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("Invalid selection.Try again.");
                display();
        }
    }

}
