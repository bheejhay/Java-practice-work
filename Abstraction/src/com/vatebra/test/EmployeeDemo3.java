/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.test;

import com.vatebra.model.FullTimeEmployee3;
import com.vatebra.model.PartTimeEmployee3;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class EmployeeDemo3 {

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

        FullTimeEmployee3 ft = new FullTimeEmployee3();
        PartTimeEmployee3 pt = new PartTimeEmployee3();

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
                System.out.print("Enter annual Salary: ");
                annual = sc.nextDouble();
                ft.setAnnualSalary(annual);
                FullTimeEmployee3 ft3 = new FullTimeEmployee3(ft.getAnnualSalary(), ft.getName(), ft.getNumber());
                System.out.println(ft3);
                System.out.println("Monthly Salary: " + nf.format(ft3.earnings()));
                displayEmployee();
                break;
            case 2:

                System.out.print("Enter days absent: ");
                absent = sc.nextInt();
                pt.setAbsent(absent);
                System.out.print("Enter hourly pay: ");
                hourpay = sc.nextDouble();
                pt.setHourlyPay(hourpay);
                PartTimeEmployee3 pt3 = new PartTimeEmployee3(pt.getHourlyPay(), pt.getName(), pt.getNumber());
                System.out.println(pt3);
                System.out.println("Weekly pay: " + nf.format(pt3.earnings()));
                displayEmployee();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.err.println("Invalid selection.Try again");
                displayEmployee();

        }
    }

}
