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
public class biggernumshow {
    public int num1,num2 ;
    public String message ;
     
    Scanner input = new Scanner(System.in);
    
    public void displaynum(){
        System.out.println("Enter any two Numbers of your choice: ");
        
        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();
        
        if(num1>num2){
            System.out.println(num1 + " is the Largest");
        }else if(num1==num2){
            System.out.println("Both numbers are Equal");
        }else
            System.out.println(num2 + " is the Largest");
        }
    }
