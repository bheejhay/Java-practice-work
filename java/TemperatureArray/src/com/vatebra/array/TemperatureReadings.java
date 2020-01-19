/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.array;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class TemperatureReadings {

    public void displayReadings() {
        Scanner keyboard = new Scanner(System.in);
        // create array
        double[] temperature;
        temperature = new double[7];
        // enter temperatures
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("enter maximum temperature for day " + (i+1));
            temperature[i] = keyboard.nextDouble();
            
        }

        // display temperatures
        System.out.println(); // blank line
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println(); // blank line
        System.out.println("DAY\t\tTEMPERATURE(C)");
        for (int i = 0; i < temperature.length; i++) {
           // System.out.println("day " + (i + 1) + "\t\t" + temperature[i]);
            System.out.println((i + 1) + "\t\t" + temperature[i]);
        }
    }

}
