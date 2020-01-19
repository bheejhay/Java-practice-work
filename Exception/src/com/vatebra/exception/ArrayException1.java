/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.exception;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class ArrayException1 {
    
    public void display(){
        final int MAX_VALUE = 5;
        Scanner sc = new Scanner(System.in);
        
        double[] arrayIn = new double[MAX_VALUE];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter values: ");
            arrayIn[i] = sc.nextDouble();
        }
    }
    
}
