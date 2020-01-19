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
public class temperatureF {
    public double celsius, fareheit;
   public int option ;
    
    Scanner input = new Scanner (System.in);
    
    public void displaytemperatureF(){
            System.out.print("Enter Temperature in Celsius: ");
            celsius = input.nextDouble();
            fareheit= calculateFareheit(celsius);
            System.out.println("value of Farenheit is= " + fareheit);
            
             if (celsius < 0){
            System.out.println("invalid number please try again");
              displaytemperatureF();
}
    else{
    displayview();
}
    }
    public double calculateFareheit (double C){
        return (9 * C/ 5) + 32 ;
    }
} 

    

       
