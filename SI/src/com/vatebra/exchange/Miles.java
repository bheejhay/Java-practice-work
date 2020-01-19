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
public class Miles {
    public int miles, gallon, trips;
    public float average, Taverage;

    Scanner inputs = new Scanner(System.in);

    public void displayavg() {
        System.out.print("Please Enter the Miles Driven: ");
        miles = inputs.nextInt();

        System.out.print("Please Enter the gallon used: ");
        gallon = inputs.nextInt();

        average = calculateaverage(miles, gallon);
        System.out.println("The total mile per gallon used is " + average + "miles");

        System.out.print("Enter number of trips: ");
        trips = inputs.nextInt();

        Taverage = calculatetotalaverage(average, trips);
        System.out.println("The total average of gallons used for all tripsis " + Taverage);
    }

    public float calculateaverage(int m, int g) {
        return m / g;
    }

    public float calculatetotalaverage(float a, int t) {
        return a * t;
    }
}
