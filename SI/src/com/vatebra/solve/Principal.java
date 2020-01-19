/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.solve;

import com.vatebra.test.MoneyTest;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class Principal {

   // public String firstName, lastName;
    public double interest, principal, rate, time;
    Scanner keyboard1 = new Scanner(System.in);
    Scanner keyboard2 = new Scanner(System.in);

    public void displayPrincipal() {
        
        System.out.print("Enter interest: ");
        interest = keyboard2.nextDouble();
        System.out.print("Enter rate: ");
        rate = keyboard2.nextDouble();
        System.out.print("Enter time: ");
        time = keyboard2.nextDouble();
        principal = calculatePrincipal(interest, rate, time);
        System.out.println("Principal = " + principal);
         MoneyTest.displayView();
    }

    public double calculatePrincipal(double i, double r, double t) {
        return (100 * i) / r * t;
    }

}
