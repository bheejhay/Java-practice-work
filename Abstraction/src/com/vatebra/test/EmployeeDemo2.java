/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.test;

import com.vatebra.model.FullTimeEmployee2;
import com.vatebra.model.PartTimeEmployee2;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class EmployeeDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        displayEmployee();
    }

    public static void displayEmployee() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int choice;
        String number, name;
        double annual, hourpay;
        int absent;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMaximumFractionDigits(2);

        FullTimeEmployee2 ft = new FullTimeEmployee2();
        PartTimeEmployee2 pt = new PartTimeEmployee2();

        System.out.print("Enter name: ");
        name = sc2.nextLine();
        ft.setName(name);
        pt.setName(name);

        System.out.print("Enter number: ");
        number = sc3.nextLine();
        ft.setNumber(number);
        pt.setNumber(number);

        System.out.println("Menu");
        System.out.println("1. Full Time Employee");
        System.out.println("2. Part Time Employee");
        System.out.println("3. Exit");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Details:" + ft.getName() + " " + ft.getNumber());
                System.out.print("Enter annual Salary: ");
                annual = sc.nextDouble();
                ft.setAnnualSalary(annual);
                
                System.out.println("Monthly Salary: " + nf.format(ft.earnings()));
                displayEmployee();
                break;
            case 2: 
                  System.out.println("Details:" + pt.getName() + " " + pt.getNumber());
                  System.out.print("Enter days absent: ");
                  absent = sc.nextInt();
                  pt.setAbsent(absent);
                  System.out.print("Enter hourly pay: ");
                  hourpay = sc.nextDouble();
                  pt.setHourlyPay(hourpay);
                  System.out.println("Weekly pay: " + nf.format(pt.earnings()));
                  displayEmployee();
                  break;
            case 3: System.exit(0);
                    break;
            default: System.err.println("Invalid selection.Try again");
                     displayEmployee();
                     
                

        }
    }

}
