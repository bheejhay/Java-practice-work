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
public class Circle {
    public final double PIE = 3.1416 ;
    public double radius ;
    public double circ, area ;
    
    Scanner sc = new Scanner(System.in);
    
    public void displaycalc(){
        System.out.println("Enter your values");
        System.out.print("Enter value of Radius: ");
        radius = sc.nextDouble();
        
        area = PIE * radius * radius ;
        System.out.println("The value of area is: " + area);
        
        circ = 2 * PIE * radius ;
        System.out.println("The value of Circumference is: " + circ);
        
        System.out.println("Thank you");
    }
    
}
