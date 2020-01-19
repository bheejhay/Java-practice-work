/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.banksystem;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class accounttype {

    public final double ACCOUNTTYPE_A = 1.5;
    public final double ACCOUNTTYPE_B = 2.0;
    public final double ACCOUNTTYPE_C = 1.5;
    public final double ACCOUNTTYPE_X = 5.0;
    public double deposit, totalAmount;
    public int option, option1, option2, option3, option4;
    public String message;

    Scanner inputnum = new Scanner(System.in);
    Scanner inputlet = new Scanner(System.in);

    public void displayaccount() {
        System.out.print("Enter Initial Deposit: ");
        deposit = inputnum.nextDouble();

        System.out.println("** Account Types Available **");
        System.out.println("**1. Account A = 1.5 **");
        System.out.println("**2. Account B = 2.0 **");
        System.out.println("**3. Account C = 1.5 **");
        System.out.println("**4. Account X = 5.0 **");
        System.out.println();

        System.out.print("Enter option: ");
        option = inputnum.nextInt();
        System.out.println();

        switch (option) {
            case 1:
                totalAmount = deposit * (ACCOUNTTYPE_A / 100) ;
                message = "Total Amount to be Earned after a Year on Account A = " + totalAmount;
                System.out.println(message);
                break;

            case 2:
                totalAmount = deposit * (ACCOUNTTYPE_B / 100);
                message = "Total Amount to be Earned after a Year on Account B = " + totalAmount;
                System.out.println(message);
                break;

            case 3:
                totalAmount = deposit * (ACCOUNTTYPE_C / 100);
                message = "Total Amount to be Earned after a Year on Account C = " + totalAmount;
                System.out.println(message);
                break;

            case 4:
                totalAmount = deposit * (ACCOUNTTYPE_X / 100);
                message = "Total Amount to be Earned after a Year on Account X = " + totalAmount;
                System.out.println(message);
                break;

            default:
                System.out.println(" Inavlid Selection try again !!!");

        }

    }

}
