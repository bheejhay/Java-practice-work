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
public class Square {

    static double a, b, k1, k2, d;
    static Scanner sc = new Scanner(System.in);

    public static void answer() {
        System.out.print("Enter value 1: ");
        a = sc.nextDouble();
        System.out.print("Enter value 2: ");
        b = sc.nextDouble();

        k1 = square(Math.pow(4, 3));
        System.out.println("Square root of " + a + " is " + k1);
        double d = square(a, b);
        k2 = Math.pow(d, 2);
        System.out.println("Square root of the sum of  " + a + "  " + b + " is " + k2);
    }

    public static double square(double a) {
        return a;
    }

    public static double square(double a, double b) {
        return a + b;
    }

}
