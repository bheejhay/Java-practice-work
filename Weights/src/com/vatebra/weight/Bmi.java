/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.weight;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Bmi {
    public double height ;
    public double weight ;
    public double Bmi ;
    
    Scanner inputs = new Scanner(System.in);
    
    public void displaybmi(){
        System.out.println("Inputs your weight and heights");
        System.out.println("input weights: ");
        weight = inputs.nextDouble();
        
        System.out.println("Inputs hrights: ");
        height = inputs.nextDouble();
        
        Bmi = weight / (height *height) ;
        System.out.println("Your Bmi is " + Bmi);
    }
}
