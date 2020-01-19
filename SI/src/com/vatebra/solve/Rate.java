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
public class Rate {

   // public String firstName, lastName;
    public double interest, principal, rate, time;
    Scanner keyboard1 = new Scanner(System.in);
    Scanner keyboard2 = new Scanner(System.in);

    public void displayRate() {
       
        System.out.print("Enter interest: ");
        interest = keyboard2.nextDouble();
        System.out.print("Enter principal: ");
        principal = keyboard2.nextDouble();
        System.out.print("Enter time: ");
        time = keyboard2.nextDouble();
        rate = calculateRate(interest, principal, time);
        System.out.println("Rate = " + rate);
        MoneyTest.displayView();
    }

    public double calculateRate(double i, double p, double t) {
        return (100 * i) / p * t;
    }

}
