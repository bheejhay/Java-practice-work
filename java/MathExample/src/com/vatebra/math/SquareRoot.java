/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.math;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class SquareRoot {
    
    static double a,b,c,k1,k2,k3;
    static Scanner sc = new Scanner(System.in);
    
    public static void displayAnswer(){
        System.out.print("Enter value 1: ");
        a = sc.nextDouble();
        System.out.print("Enter value 2: ");
        b = sc.nextDouble();
        
        k1 = squareRoot(Math.sqrt(a));
        System.out.println("Square root of " + a + " is " + k1);
        double d = squareRoot(a, b);
        k2 = Math.sqrt(d);
        System.out.println("Square root of the sum of  " + a + "  " + b + " is " + k2);
    }

    public static double squareRoot(double a) {
        return a;
    }

    public static double squareRoot(double a, double b) {
        return a + b;
    }

 

}
