/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.array;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Numsum {
    
    final int MAX_NUM = 15;
    double sum = 0;
    double y = 0;
    double avg;
    double k = y;
    final int QUIT = 99999;
    double[] num = new double[MAX_NUM];
    int i = 0;
    
    Scanner sc = new Scanner(System.in);
    
    public void displaynumsum() {
        System.out.println("Enter 15 numbers of your choice or 99999 to Quit: ");
        double number = sc.nextDouble();
        
        while (number != QUIT) {
            num[i] = number;
            sum += num[i];
            i++;
            if (i == MAX_NUM) {
                System.exit(0);
            } else {
                number = sc.nextDouble();
            }
        }
        avg = calculateavg(sum);
        NumberFormat avgFormat = NumberFormat.getNumberInstance();
        avgFormat.setMaximumFractionDigits(2);
        System.out.println("The Average of the numbers inputed is " + avgFormat.format(avg));
    }
    public double calculateavg(double k) {
        return k / MAX_NUM;
    }
}
