/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.exchange;

import static com.vatebra.test.temperaturetest.displayview;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TemperatureC {
    public double celsius, fareheit;
   public int option ;
    
    Scanner input = new Scanner (System.in);
    
    public void displaycelsius(){
        System.out.print("Enter temperature in farenheit: ");
        fareheit = input.nextDouble();
        celsius= calculateCelsius (fareheit);
        System.out.println("value of celsius is= "+ celsius);
        
    
    if (fareheit < 0){
            System.out.println("invalid number please try again");
             displaycelsius();
}
    else{
    displayview();
}
    }
    public double calculateCelsius (double F){
        return (F-32)*5 / 9 ;
    }
    
}

