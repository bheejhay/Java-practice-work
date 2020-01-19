/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.controller;

import com.vatebra.model.SalaryEmployee;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class SalaryEmployeeController {

    public void displaySalaryEmployee() {
        String name;
        int number, absent;
        double salary, sal;
        Scanner sc = new Scanner(System.in);

        SalaryEmployee se = new SalaryEmployee();

        System.out.print("Enter name:");
        name = sc.next();
        se.setName(name);

        System.out.print("Enter number:");
        number = sc.nextInt();
        se.setNumber(number);

        System.out.print("Enter number of days absent (0 if no absent):");
        absent = sc.nextInt();
        se.setAbsent(absent);

        System.out.print("Enter salary:");
        salary = sc.nextDouble();
        se.setSalary(salary);

        sal = se.calculateSalary(se.getSalary(), se.getAbsent());

        System.out.println("Your salary is " + sal);
    }

}
