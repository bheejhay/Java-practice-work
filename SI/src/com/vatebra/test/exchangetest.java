/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.test;

import com.vatebra.solve.ExchangeRate;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class exchangetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExchangeRate ex = new ExchangeRate();
        ex.display();
        displayoption();

    }
    

    public static void displayoption() {
    int option;
    Scanner input = new Scanner(System.in);
    
        System.out.println("please select from the option Below: ");
        System.out.println("**1. Do you wish to continue conversion: ");
        System.out.println("**2.  Exit:                              ");

        System.out.println("Enter option: ");
        option = input.nextInt();
        
        switch (option) {
            case 1:
                ExchangeRate ex = new ExchangeRate();
                ex.display();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
}
