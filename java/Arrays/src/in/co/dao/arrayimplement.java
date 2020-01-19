/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.dao;

import in.co.model.arrayintegers;

/**
 *
 * @author USER
 */
public class arrayimplement extends arrayintegers {

    public int numbers;
    int count;
    double average;
    int total;
    // int num[] = new int[8];

    public arrayimplement(int numbers) {
        super(numbers);
    }

    public arrayimplement() {
    }
    arayInte arek = new arayInte();

    public void displaynumbers() {
        System.out.println("\tEnter numbers of your choice: ");
        for (int i = 0; i < num.length; i++) {
            numbers = utilClass.nextint();
            arek.setNumbers(numbers);
            num[i] = numbers;
            total += num[i];
        }
        System.out.println();
        System.out.println("Numbers Entered are: ");
        for (int i = 0; i < num.length; i++) {
            int j = num[i];
            System.out.print(j + " ");

        }
        System.out.println();

        System.out.println("The Total Number is: " + total);
        average = arek.average(total);
        System.out.println("the Average of numbers entered is: " + average);
        //  arek.max(total);

    }

    public void max() {
        System.out.println("Numbers higher than Average are");
        for (int i = 0; i < num.length; i++) {
            if (num[i] > average) {
                System.out.print(num[i] + " ");

            }

        }

    }

    public void reverse() {
        System.out.println();
        System.out.println("Reverse of the Numbers are: ");
        for (int i = num.length - 1; i >= 0; i--) {
            int j = num[i];
            System.out.print(j + " ");

        }
        System.out.println();
    }
}
