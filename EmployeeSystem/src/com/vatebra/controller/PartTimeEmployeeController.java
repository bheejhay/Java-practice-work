/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.controller;

import com.vatebra.model.PartTimeEmployee;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class PartTimeEmployeeController {

    public void displayPartTimeEmployee() {
        int number;
        double hourlyPay;
        String name;
        PartTimeEmployee e = new PartTimeEmployee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.next();
        e.setName(name);

        System.out.print("Enter number: ");
        number = sc.nextInt();
        e.setNumber(number);

        System.out.print("Enter hourly pay: ");
        hourlyPay = sc.nextDouble();
        e.setHourlyPay(hourlyPay);

        double pay = e.calculateHourlyPay(e.getHourlyPay());
        System.out.println("Hourly pay: " + pay);

    }
}
