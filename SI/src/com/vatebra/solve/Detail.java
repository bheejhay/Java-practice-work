/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.solve;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class Detail {

    public String firstName, lastName;
    public double interest, principal, rate, time;
    Scanner keyboard1 = new Scanner(System.in);

    public void displayDetail() {
        System.out.print("Enter first name: ");
        firstName = keyboard1.next();
        System.out.print("Enter last name: ");
        lastName = keyboard1.next();
    }
}
