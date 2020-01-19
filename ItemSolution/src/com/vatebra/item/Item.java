/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.item;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class Item {

    public final double ITEM_A = 20.25;
    public final double ITEM_B = 30.45;
    public final double ITEM_C = 60.48;
    public double quantity, total;
    public String itemOption;
    public String firstName, lastName;
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    public void displayItem() {
        System.out.print("Enter first name: ");
        firstName = sc1.next();
        System.out.print("Enter last name: ");
        lastName = sc1.next();
        System.out.println("****************************************************");
        System.out.println("*         MENU OPTION                              *");
        System.out.println("* 1. ITEM A: 20.25 naira                           *");
        System.out.println("* 2. ITEM B: 30.45 naira                           *");
        System.out.println("* 3. ITEM C: 60.48 naira                           *");
        System.out.println("****************************************************");
        System.out.print("Enter option: ");
        itemOption = sc1.next();

        switch (itemOption) {
            case "1":
                System.out.println("Enter quantity");
                quantity = sc1.nextDouble();
                total = quantity * ITEM_A;
                if (quantity < 2) {
                    System.out.println("Total cost for " + quantity + " quantity =  " + total);
                } else {
                    System.out.println("Total cost for " + quantity + " quantities =  " + total);
                }
                break;
            case "2":
                System.out.println("Enter quantity");
                quantity = sc1.nextDouble();
                total = quantity * ITEM_B;
                if (quantity < 2) {
                    System.out.println("Total cost for " + quantity + " quantity =  " + total);
                } else {
                    System.out.println("Total cost for " + quantity + " quantities =  " + total);
                }
                break;
            case "3":
                System.out.println("Enter quantity");
                quantity = sc1.nextDouble();
                total = quantity * ITEM_C;
                if (quantity < 2) {
                    System.out.println("Total cost for " + quantity + " quantity =  " + total);
                } else {
                    System.out.println("Total cost for " + quantity + " quantities =  " + total);
                }
                break;
            default: System.out.println("Invalid selection");
        }
    }
}
