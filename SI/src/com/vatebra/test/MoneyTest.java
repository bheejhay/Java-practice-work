/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.test;

import com.vatebra.solve.Detail;
import com.vatebra.solve.Interest;
import com.vatebra.solve.Principal;
import com.vatebra.solve.Rate;
import com.vatebra.solve.Time;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class MoneyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Detail d = new Detail();
        d.displayDetail();

        displayView();
    }

    public static void displayView() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("                 MENU                    ");
        System.out.println("     1.INTEREST                          ");
        System.out.println("     2.PRINCIPAL                         ");
        System.out.println("     3.RATE                              ");
        System.out.println("     4.TIME                              ");
        System.out.println("     5.EXIT                              ");
        System.out.println("*****************************************");

        System.out.print("Enter option");
        option = sc.nextInt();
        switch (option) {
            case 1:
                Interest i = new Interest();
                i.displayInterest();
                break;
            case 2:
                Principal p = new Principal();
                p.displayPrincipal();
                break;
            case 3:
                Rate r = new Rate();
                r.displayRate();
                break;
            case 4:
                Time t = new Time();
                t.displayTime();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Error.Try again");
                displayView();
        }
    }

}
