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
public class Item2 {

    public final double ITEM_A = 20.25;
    public final double ITEM_B = 30.45;
    public final double ITEM_C = 60.48;
    public double quantity, quantity1, quantity2, quantity3, total, total1, total2, total3;
    public int itemOption;
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
        System.out.println("* 4. ITEM A and B                                  *");
        System.out.println("* 5. ITEM A and C                                  *");
        System.out.println("* 6. ITEM B and C                                  *");
        System.out.println("* 7. ITEM A B and C                                *");
        System.out.println("****************************************************");
        System.out.print("Enter option: ");
        itemOption = sc1.nextInt();
        if (itemOption == 1) {
            System.out.println("Enter quantity");
            quantity = sc1.nextDouble();
            total = quantity * ITEM_A;
            if (quantity < 2) {
                System.out.println("Total cost for " + quantity + " quantity =  " + total);
            } else {
                System.out.println("Total cost for " + quantity + " quantities =  " + total);
            }
        } else if (itemOption == 2) {
            System.out.println("Enter quantity");
            quantity = sc1.nextDouble();
            total = quantity * ITEM_B;
            if (quantity < 2) {
                System.out.println("Total cost for " + quantity + " quantity =  " + total);
            } else {
                System.out.println("Total cost for " + quantity + " quantities =  " + total);
            }
        } else if (itemOption == 3) {
            System.out.println("Enter quantity");
            quantity = sc1.nextDouble();
            total = quantity * ITEM_C;
            if (quantity < 2) {
                System.out.println("Total cost for " + quantity + " quantity =  " + total);
            } else {
                System.out.println("Total cost for " + quantity + " quantities =  " + total);
            }
        } else if (itemOption == 4) {
            System.out.println("Enter quantity for Item A");
            quantity1 = sc1.nextDouble();
            System.out.println("Enter quantity for Item B");
            quantity2 = sc1.nextDouble();
            total1 = quantity1 * ITEM_A;
            total2 = quantity2 * ITEM_B;
            total = total1 + total2;
            System.out.println("Total cost for " + quantity1 + " quantity" + " and " + quantity2 + " quantity = " +total);

        }else if(itemOption == 5){
            System.out.println("Enter quantity for Item A");
            quantity1 = sc1.nextDouble();
            System.out.println("Enter quantity for Item C");
            quantity2 = sc1.nextDouble();
            total1 = quantity1 * ITEM_A;
            total2 = quantity2 * ITEM_C;
            total = total1 + total2;
            System.out.println("Total cost for " + quantity1 + " quantity" + " and " + quantity2 + " quantity = " +total);
        }else if(itemOption ==6){
            System.out.println("Enter quantity for Item B");
            quantity1 = sc1.nextDouble();
            System.out.println("Enter quantity for Item C");
            quantity2 = sc1.nextDouble();
            total1 = quantity1 * ITEM_B;
            total2 = quantity2 * ITEM_C;
            total = total1 + total2;
            System.out.println("Total cost for " + quantity1 + " quantity" + " and " + quantity2 + " quantity = " +total);
        }else if(itemOption == 7){
            System.out.println("Enter quantity for Item A");
            quantity1 = sc1.nextDouble();
            System.out.println("Enter quantity for Item B");
            quantity2 = sc1.nextDouble();
            System.out.println("Enter quantity for Item C");
            quantity3 = sc1.nextDouble();
            total1 = quantity1 * ITEM_A;
            total2 = quantity2 * ITEM_B;
            total3 = quantity3 * ITEM_C;
            total = total1 + total2+total3;
            System.out.println("Total cost for " + quantity1 + " quantity" + " , " + quantity2 + " and " + quantity3 + " quantity" + total);
        }else{
            System.out.println("Invalid selection");
        }

    }
}
