/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.demo;

import com.vatebra.account.GoldAccount;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        display();

    }

    public static void display() {
        GoldAccount ga = new GoldAccount();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double amount, deposit, overdraft, balance, fBalance;
        boolean withdraw ;
        int choice;
        System.out.println("Choose option: ");
        System.out.println("1. DEPOSIT ");
        System.out.println("2. WITHDRAW ");
        System.out.println("3. EXIT ");

        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter overdraft limit:  ");
                overdraft = sc2.nextDouble();
                System.out.print("Enter amount:  ");
                amount = sc2.nextDouble();
                deposit = ga.deposit(amount);
                System.out.printf("Deposit amount = %.2f", deposit);
                display();
                break;
            case 2:
                System.out.print("Enter overdraft limit:  ");
                overdraft = sc2.nextDouble();
                System.out.print("Enter balance:  ");
                balance = sc2.nextDouble();
                System.out.print("Enter amount to withdraw:  ");
                amount = sc2.nextDouble();

                fBalance = ga.finalBalance(amount, balance, overdraft);

                withdraw = ga.withdraw(fBalance);

                if (!withdraw) {
                    System.out.println("Transaction completed.");
                    System.out.println("Your balance is " + fBalance);
                } else {
                    System.out.println("Insufficient fund.");
                }
                display();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection.Try again");
                display();

        }

    }

}
