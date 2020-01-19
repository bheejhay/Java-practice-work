/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebele.store;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class Customer {

    double ALLOWED_CREDIT_LIMIT = 20000;
    public String accountNumber;
    public double beginningBalance, newBalance, totalItem, totalCredit;
    Scanner sc = new Scanner(System.in);

    public void displayResult() {
        System.out.print("Enter Account number  ");
        accountNumber = sc.next();
        System.out.print("Enter beginning balance:  ");
        beginningBalance = sc.nextDouble();
        System.out.print("Enter total of all items charged by the customer this month:  ");
        totalItem = sc.nextDouble();
        System.out.print("Enter total of all credits applied to the customer’s account this month:  ");
        totalCredit = sc.nextDouble();

        newBalance = calculateNewBalance(beginningBalance, totalItem, totalCredit);

        if (newBalance < ALLOWED_CREDIT_LIMIT) {
            System.out.println("new balance is  " + newBalance);
        } else {
            displayMessage();
        }
    }

    public double calculateNewBalance(double b, double c, double cr) {
        return b + c - cr;
    }

    public void displayMessage() {
        System.out.println("Credit Limit exceeded.");
    }

}
