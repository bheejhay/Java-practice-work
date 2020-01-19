/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.grade;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class Grade {

    public String firstName;
    public String lastName;
    public String subject;
    public String grade;
    public String message;
    public int age;
    public double mark;
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    public void displayGrade() {
        System.out.print("First name: ");
        firstName = input1.next();
        System.out.print("Last name: ");
        lastName = input1.next();
        System.out.print("Age: ");
        age = input2.nextInt();
        System.out.print("Enter subject: ");
        subject = input1.next();
        System.out.print("Enter mark: ");
        mark = input2.nextDouble();

        if (mark <= 100) {
            if (mark >= 70 && mark <= 100) {
                grade = "A";
                System.out.println("Grade= " + grade);
            } else if (mark >= 60 && mark <= 69) {
                grade = "B";
                System.out.println("Grade= " + grade);
            } else if (mark >= 50 && mark <= 59) {
                grade = "C";
                System.out.println("Grade= " + grade);
            } else if (mark >= 45 && mark <= 49) {
                grade = "D";
                System.out.println("Grade= " + grade);
            } else if (mark >= 40 && mark <= 44) {
                grade = "E";
                System.out.println("Grade= " + grade);
            } else {
                grade = "F";
                System.out.println("Grade= " + grade);
            }
        } else {
            message = mark + " is out of range";
            System.out.println(message);
        }

    }
}
