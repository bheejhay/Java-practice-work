/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.math;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class Maximum {
    
    static double k1,k2,k3,max1;
    static int d1,d2,d3,d4,d5,max2;
    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    
    public static void maximum(){
        System.out.println("**** double *******");
        System.out.print("enter double value 1: ");
        k1 = sc1.nextDouble();
        System.out.print("enter double value 2: ");
        k2 = sc1.nextDouble();
        System.out.print("enter double value 3: ");
        k3 = sc1.nextDouble();
        System.out.println("**** int *******");
         System.out.print("enter int value 1: ");
        d1 = sc1.nextInt();
        System.out.print("enter int value 2: ");
        d2 = sc1.nextInt();
        System.out.print("enter int value 3: ");
        d3 = sc1.nextInt();
        System.out.print("enter int value 4: ");
        d4 = sc1.nextInt();
        System.out.print("enter int value 5: ");
        d5 = sc1.nextInt();
        
        max1 = max(k1, k2, k3);
        System.out.println(k1 + "," + k2 + "," + k3);
        System.out.println("The maximum of the three values above: ");
        System.out.println("is " + max1);
        
        max2 = max(d1, d2, d3, d4, d5);
        System.out.println(d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5);
        System.out.println("The maximum of the five values above: ");
        System.out.println("is " + max2);
    }
    
    
    public static double max(double a,double b,double c){
        return Math.max(a, Math.max(b, c));
    }
    
    public static int max(int a,int b,int c,int d,int e){
        return Math.max(Math.max(a, b), Math.max(c, Math.max(d, e)));
    }
    
}
