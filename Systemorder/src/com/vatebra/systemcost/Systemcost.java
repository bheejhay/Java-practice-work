/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.systemcost;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Systemcost {

    public double SYSTEMCOST = 375.99;
    public double SCREEN38cm = 75.99;
    public double SCREEN43cm = 99.99;
    public int itemOption;
    public double ANTIVIRUS = 65.99;
    public double PRINTER = 125.00;
    public double price, option1, option2, option3, option4;
    public String message;

    Scanner keyboard = new Scanner(System.in);

    public void display() {

        System.out.println("Basic System Cost: " + SYSTEMCOST);

        System.out.println("**          menu options         **");
        System.out.println("** option1: Screen38cm: 75.99  + Antivirus software: 65.99   **");
        System.out.println("** option2: Screen43cm: 99.99 + Printer: 125.00              **");
        System.out.println("** option3: Screen38cm: 75.99 + Printer: 125.00              **");
        System.out.println("** option4: Screen43cm: 99.99 + Antivirus software: 65.99    **");
        System.out.println();
        System.out.println(" NOTE: **whatever option you choose would be added to your Basic computer cost = 375.99 ** ");
        System.out.println();
        System.out.print(" Enter option: ");
        itemOption = keyboard.nextInt();

        switch (itemOption) {
            case 1:
                option1 = 75.99 + 65.99;
                price = SYSTEMCOST + option1;
                message = "Basic Computer: " + SYSTEMCOST + ", Screentype: " + SCREEN38cm + ", Antivirus: " + ANTIVIRUS;
                System.out.println(message);
                System.out.println("Total cost= " + price);
                break;

            case 2:
                option2 = 99.99 + 125.00;
                price = SYSTEMCOST + option2;
                message = "Basic Computer: " + SYSTEMCOST + ", Screentype: " + SCREEN43cm + ", Printer: " + PRINTER;
                System.out.println(message);
                System.out.println(" Total cost: " + price);
                break;

            case 3:
                option3 = 75.99 + 125.00;
                price = SYSTEMCOST + option3;
                message = "Basic Computer: " + SYSTEMCOST + ", Screentype: " + SCREEN38cm + ", Printer: " + PRINTER;
                System.out.println(message);
                System.out.println("Total cost: " + price);
                break;

            case 4:
                option4 = 99.99 + 655.99;
                price = SYSTEMCOST + option4;
                message = "Basic Computer: " + SYSTEMCOST + ", Screentype: " + SCREEN43cm + ", Antivirus: " + ANTIVIRUS;
                System.out.println(message);
                System.out.println("total cost: " + price);
                break;
           
            default:
                System.out.println(" Invalid Selection !!! ");
        }

    }

}
