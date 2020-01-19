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
public class Time {

   // public String firstName, lastName;
    public double interest, principal, rate, time;
    Scanner keyboard1 = new Scanner(System.in);
    Scanner keyboard2 = new Scanner(System.in);

    public void displayTime() {
        
        System.out.print("Enter interest: ");
        interest = keyboard2.nextDouble();
        System.out.print("Enter rate: ");
        rate = keyboard2.nextDouble();
        System.out.print("Enter principal: ");
        principal = keyboard2.nextDouble();
        time = calculateTime(interest, rate, principal);
        System.out.println("Time = " + time);
         MoneyTest.displayView();
    }

    public double calculateTime(double i, double r, double p) {
        return (100 * i) / r * p;
    }

}
