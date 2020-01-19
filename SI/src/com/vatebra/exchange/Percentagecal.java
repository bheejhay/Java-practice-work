/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.exchange;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Percentagecal {
    public double firstNum, secondNum, percent;
    
    Scanner inputs= new Scanner(System.in);
    
    public void displaypercent(){
        System.out.print("Enter First Number: ");
        firstNum = inputs.nextDouble();
        
        System.out.print("Enter Second Number: ");
        secondNum = inputs.nextDouble();
        
        percent = calculatePercent(firstNum,secondNum);
        
    
        System.out.println(firstNum + " is "+ percent+ " of " + secondNum);
    }
    
    public double calculatePercent(double f, double s){
        return (f / s) * 100 ;
    }
        
}
