/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.controller;

import com.vatebra.model.CommisionEmployee;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class commisionController {
    public void displaycommission(){
        int number, people;
        String name ;
        double salary, commission ;
        CommisionEmployee comm = new CommisionEmployee();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = sc.next();
        comm.setName(name);
        
        System.out.print("enter Number: ");
        number = sc.nextInt();
        comm.setNumber(number);
        
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        comm.setSalary(salary);
        
        System.out.print("Enter Number of people you Engaged: ");
        people = sc.nextInt();
        comm.setPeople(people);
        
        commission = comm.calcualtecommission(comm.getPeople(), salary);
        NumberFormat commissionFormat = NumberFormat.getNumberInstance();
        commissionFormat.setMaximumFractionDigits(2);
        System.out.println("your Commssion= " + commissionFormat.format(commission) );
        
}   
}
