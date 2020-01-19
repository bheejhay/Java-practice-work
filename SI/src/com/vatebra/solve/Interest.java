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
public class Interest {
   
   public double interest,principal,rate,time;
   Scanner keyboard1 = new Scanner(System.in);
   Scanner keyboard2 = new Scanner(System.in);
   public void displayInterest(){
       System.out.print("Enter principal: ");
       principal = keyboard2.nextDouble();
       System.out.print("Enter rate: ");
       rate = keyboard2.nextDouble();
       System.out.print("Enter time: ");
       time = keyboard2.nextDouble();
       interest = calculateInterest(principal, rate, time);
       System.out.println("Interest = " + interest);
       MoneyTest.displayView();
   }
   
   public double calculateInterest(double p,double r, double t){
       return (p*r*t)/100;
   }
  
   
   
    
}
