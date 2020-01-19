/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goodshephard.school.view;

import com.goodshephard.school.controller.EmployeeDetailController;
import com.goodshephard.school.util.ScannerUtil;

/**
 *
 * @author USER
 */
public class EmployeeDetailview {

    public static void main(String[] args) {

        EmployeeDetailController emc = new EmployeeDetailController();
        char choice;

        do {
            System.out.println();
            System.out.println("1. Create new Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. List all Employee");
            System.out.println("6. Quit");

            System.out.println();
            System.out.println("Enter your choice(1-6): ");
            choice = ScannerUtil.nextChar();

            switch (choice) {
                case '1':
                    option1(emc);
                    break;
                case '2':
                    option2(emc);
                    break;
                case '3':
                    option3(emc);
                    break;
                case '4':
                    option4(emc);
                    break;
                case '5':
                    option5(emc);
                    break;

            }
        } while (choice != 6);

    }

    public static void option1(EmployeeDetailController emc) {
        System.out.println("Enter your First name: ");
        String first = ScannerUtil.nextString();

        System.out.println("Enter your Last name: ");
        String last = ScannerUtil.nextString();

        System.out.println("Enter your Middle name: ");
        String middle = ScannerUtil.nextString();

        System.out.println("Enter Gender: ");
        String gender = ScannerUtil.nextString();

        System.out.println("Enter your Subject: ");
        String Subject = ScannerUtil.nextString();

        System.out.println("Enter your department number: ");
        String Deptno = ScannerUtil.nextString();

        emc.addEmployee(first, last, middle, gender, Subject, Deptno);
    }

    public static void option2(EmployeeDetailController emc) {
        System.out.println("Enter Employee id: ");
        int id = ScannerUtil.nextInt();

        System.out.println("Enter your First name: ");
        String first = ScannerUtil.nextString();

        System.out.println("Enter your Last name: ");
        String last = ScannerUtil.nextString();

        System.out.println("Enter your Middle name: ");
        String middle = ScannerUtil.nextString();

        System.out.println("Enter Gender: ");
        String gender = ScannerUtil.nextString();

        System.out.println("Enter your Subject: ");
        String Subject = ScannerUtil.nextString();

        System.out.println("Enter your department number: ");
        String Deptno = ScannerUtil.nextString();

        emc.updateEmployee(id, first, last, middle, gender, Subject, Deptno);
    }
     public static void option3(EmployeeDetailController emc){
        System.out.println("Enter Employee id: ");
        int id = ScannerUtil.nextInt();
        emc.deleteEmployee(id);
    }
      public static void option4(EmployeeDetailController emc){
        System.out.println("Enter Employee id: ");
        int id = ScannerUtil.nextInt();
        emc.getEmployeeById(id);
      }
       public static void option5(EmployeeDetailController emc){
        emc.selectAllEmployee();
       }
       
}
