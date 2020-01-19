/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.test;

import com.vatebra.exchange.TemperatureC;
import com.vatebra.exchange.temperatureF;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class temperaturetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        displayview();
    }

    public static void displayview() {
        int option;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any option of your choice: ");
        System.out.println("1. calculate celsius ");
        System.out.println("2. calculate farenheit ");
        System.out.println(" 3. Exit ");

        System.out.print("Enter option: ");
        option = input.nextInt();

        switch (option) {
            case 1:
                TemperatureC cels = new TemperatureC();
                cels.displaycelsius();
                break;
            case 2:
                temperatureF far = new temperatureF();
                far.displaytemperatureF();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("invalid entry please try again!!!");
                displayview();

        }

    }

}
