/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.model;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EmployeeDemo {

    Scanner scA = new Scanner(System.in);
    Scanner scN = new Scanner(System.in);

    public String num, name, SSN;
    public double weekly, gross, commision, wage, hours, baseS;
    public int option;

    public void displayEmployee() {
        SalariedEmployee sal = new SalariedEmployee();
        HourlyEmployee hou = new HourlyEmployee();
        CommisionEmployees com = new CommisionEmployees();
        BaseplusCommissionemployee base = new BaseplusCommissionemployee();

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMaximumFractionDigits(2);

        System.out.print("Enter First Name: ");
        name = scA.next();
        sal.setFirstName(name);
        hou.setFirstName(name);
        com.setFirstName(name);
        base.setFirstName(name);

        System.out.print("Enter Last Name: ");
        name = scA.next();
        sal.setLastName(name);
        hou.setLastName(name);
        com.setLastName(name);
        base.setLastName(name);

        System.out.print("Enter your SSN: ");
        SSN = scN.next();
        sal.setSSN(SSN);
        hou.setSSN(SSN);
        com.setSSN(SSN);
        base.setSSN(SSN);

        System.out.println("*** Menu Options ***");
        System.out.println("1. Salaried Employee ");
        System.out.println("2. Hourly payed Employee");
        System.out.println("3. Commision payed Employee");
        System.out.println("4. Base Plus Commission payed Employee");
        System.out.println("5. Exit ");

        System.out.println("Enter option: ");
        option = scN.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter your Weekly pay: ");
                weekly = scN.nextDouble();
                sal.setWeeklySalary(weekly);
                SalariedEmployee sa = new SalariedEmployee(sal.getWeeklySalary(), sal.getFirstName(), sal.getLastName(), sal.getSSN());
                System.out.println(sa);
                System.out.println("Your Total Salary is: " + nf.format(sa.earnings()));
                break;
            case 2:
                System.out.println("Enter your wage: ");
                wage = scN.nextDouble();
                hou.setHourlyWage(wage);
                System.out.println("Enter Number of hours: ");
                hours = scN.nextDouble();
                hou.setHours(hours);
                HourlyEmployee ho = new HourlyEmployee(hou.getHourlyWage(), hou.getHours(), hou.getFirstName(), hou.getLastName(), hou.getSSN());
                System.out.println("Your Total Salary is: " + nf.format(ho.earnings()));
                break;
            case 3:
                System.out.println("Enter your Gross Pay: ");
                gross = scN.nextDouble();
                com.setGrossSales(gross);
                System.out.println("Enter your Commission per Customer: ");
                commision = scN.nextDouble();
                com.setCommisionRate(commision);
                CommisionEmployees cm = new CommisionEmployees(com.getGrossSales(), com.getCommisionRate(), com.getFirstName(), com.getLastName(), com.getSSN());
                System.out.println(cm);
                System.out.println("Your Total Salary is: " + nf.format(cm.earnings()));
                break;
            case 4:
                System.out.println("Enter your base Salary: ");
                baseS = scN.nextDouble();
                base.setBaseSalary(baseS);
                System.out.println("Enter your Commision per Customer: ");
                commision = scN.nextDouble();
                base.setCommisionRate(commision);
                System.out.println("Enter Gross pay: ");
                gross = scN.nextDouble();
                base.setGrossSales(gross);
                BaseplusCommissionemployee bc = new BaseplusCommissionemployee(base.getBaseSalary(), base.getGrossSales(), base.getCommisionRate(), base.getFirstName(), base.getLastName(), base.getSSN());
                System.out.println(bc);
                System.out.println("Your Total Salary is: " + nf.format(bc.earnings()));
                break;
            case 5:
                System.exit(0);

            default:
                System.out.println("Invalid Entry please try again !!!");
                displayEmployee();
        }

    }
}
