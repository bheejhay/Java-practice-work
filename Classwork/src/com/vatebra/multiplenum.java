/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class multiplenum {

    public int num1, num2, num3;
    public String message;

    Scanner input = new Scanner(System.in);

    public void displaymultiple() {
        System.out.println("** Enter any two numbers of your choice** ");

        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        num3 = num1 * num1 ;

        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();
        
        if(num3== num2){
            System.out.println(num1 + " is a multiple of " + num2);
        }else{
            System.out.println(num1 +" is not a multiple of " + num2);
        }

    }

}
