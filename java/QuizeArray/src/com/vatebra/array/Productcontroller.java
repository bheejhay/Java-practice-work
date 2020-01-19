/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.array;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Productcontroller {

    int option, quantity;
    double productPrice, tp1, tp2, tp3, tp4, tp5;

    productcheck pro = new productcheck();

    Scanner sc = new Scanner(System.in);

    public void displayproduct() {
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            
            System.out.println("**Choose Products of your choice**");
            System.out.println("**Choose as Many as you Desire**");
            System.out.println("1.  product Orange   -   2.98");
            System.out.println("2.  product Apple    -   4.50");
            System.out.println("3.  product Banana   -   9.98");
            System.out.println("4.  product Pawpaw   -   4.49");
            System.out.println("5.  product Lemon    -   6.87");
            System.out.println("6.  Exit                ");

            System.out.println("Enter your options: ");
            option = sc.nextInt();
            if (option == 6) {
                System.exit(0);
            } else {
                System.out.println("Enter Quantity: ");
                quantity = sc.nextInt();

                switch (option) {
                    case 1:
                        tp1 = pro.calculatetotalPrice(pro.getPRODUCT1(), quantity);
                        System.out.println("Total price is " + tp1);

                        break;
                    case 2:
                        tp2 = pro.calculatetotalPrice(pro.getPRODUCT2(), quantity);
                        System.out.println("Total price is " + tp2);

                        break;
                    case 3:
                        tp3 = pro.calculatetotalPrice(pro.getPRODUCT2(), quantity);
                        System.out.println("Total price is " + tp3);

                        break;
                    case 4:
                        tp4 = pro.calculatetotalPrice(pro.getPRODUCT4(), quantity);
                        System.out.println("Total price is " + tp4);
                        break;
                    case 5:
                        tp5 = pro.calculatetotalPrice(pro.getPRODUCT5(), quantity);
                        System.out.println("Total price is " + tp5);
                        break;
                    default:
                        System.out.println("invalid Option please try again: ");
                        displayproduct();
                }

                System.out.println("Do you want to continue (y/n) ?: ");
                choice = sc.next();

            }

            if (!choice.equalsIgnoreCase("n")) {
                System.out.println("invalid Selection!!!");
                displayproduct();
            }else{
                System.exit(0);

            }
        }
    }
}
