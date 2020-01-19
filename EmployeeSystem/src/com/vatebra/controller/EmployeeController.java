/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.controller;

import com.vatebra.model.Employee;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class EmployeeController {

    public void displayEmployee() {
        int number;
        String name;
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.next();
        e.setName(name);

        System.out.print("Enter number: ");
        number = sc.nextInt();
        e.setNumber(number);
    }
}
