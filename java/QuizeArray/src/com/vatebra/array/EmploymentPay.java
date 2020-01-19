/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.array;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EmploymentPay {

    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    final int MAX_NUM = 3;
    int[] numberOfHours = new int[MAX_NUM];
    double[] hourlyRate = new double[MAX_NUM];
    String[] employee = new String[MAX_NUM];
    double pay;

    public void displayGrosspay() {
        for (int i = 0; i < numberOfHours.length; i++) {
            System.out.println("Enter Employee name " + (1 + i) + " : ");
            employee[i] = sc1.next();

            System.out.println("Enter number of Hours " + (1 + i) + " : ");
            numberOfHours[i] = sc2.nextInt();

            System.out.println("Enter Hourly Rate " + (1 + i) + " : ");
            hourlyRate[i] = sc2.nextDouble();

            if (numberOfHours[i] > 40) {
                pay = calculateGrosspay(numberOfHours[i], hourlyRate[i]);
                double pay2= pay + pay/2 ;
                System.out.println("The total pay for " + employee[i] + " is " + pay2);

            } else if (numberOfHours[i] == 40) {
                pay = calculateGrosspay(numberOfHours[i], hourlyRate[i]);
                System.out.println("The total pay for " + employee[i] + " is " + pay);
            }else{
                System.out.println(employee[i] + ", your Number of Hours is below 40 ");

            }

        }
    }

    public double calculateGrosspay(int hours, double rate) {
        return hours * rate;

    }
}
