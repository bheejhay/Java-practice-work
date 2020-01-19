/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.controller;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class MainController {

    public static void displayView() {

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("*********************************");
        System.out.println("     CHOOSE AN OPTION     ");
        System.out.println("     1. Employee          ");
        System.out.println("     2. Part Time         ");
        System.out.println("     3. Salary            ");
        System.out.println("     4. Commission         ");
        System.out.println("     5. Exit              ");
        System.out.println("*********************************");
        
        System.out.print("Input option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                EmployeeController e = new EmployeeController();
                e.displayEmployee();
                displayView();
                break;
            case 2:
                PartTimeEmployeeController p = new PartTimeEmployeeController();
                p.displayPartTimeEmployee();
                displayView();
                break;
            case 3:
                SalaryEmployeeController s = new SalaryEmployeeController();
                s.displaySalaryEmployee();
                displayView();
                break;
            case 4:
                commisionController c = new commisionController();
                c.displaycommission();
                displayView();
                break;
            case 5:
                System.exit(0);
               
                
            default:
                System.out.println("Wrong Selection");
                displayView();
                break;

        }

    }

}
