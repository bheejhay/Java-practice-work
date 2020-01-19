/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.task;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class DisplayEvenNumber {

    public void displayEven() {
        int firstNumber, lastNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter even number range you want");
        firstNumber = sc.nextInt();
        System.out.println();
        lastNumber = sc.nextInt();
        System.out.println("Even number between " + firstNumber + " and " + lastNumber);

        if (firstNumber % 2 == 0) {
            for (; firstNumber <lastNumber ; firstNumber += 2) {
                System.out.print(firstNumber + " ");
            }
            System.out.println();

        } else  {
            System.out.println(firstNumber + " is not an even number Oga Isreel");
        }
    }

}
