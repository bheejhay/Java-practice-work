/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class IfElseExample {
    String name;
    String message;
    int age;
    int TEST_AGE = 13;
    Scanner keyboard1 = new Scanner(System.in);
    Scanner keyboard2 = new Scanner(System.in);

    public void display() {
        System.out.print("Enter age: ");
        age = keyboard1.nextInt();
        System.out.print("Enter name: ");
        name = keyboard2.nextLine();
        if (age < TEST_AGE) {
            message = "Hello Junior " + name;
            System.out.println(message);
        }else{
            message = age + " is not the required age";
            System.out.println(message);
        }
    }
}
