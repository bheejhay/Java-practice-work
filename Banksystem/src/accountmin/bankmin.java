/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountmin;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class bankmin {

    public final double ACCOUNTTYPE_A = 1.5;
    public final double ACCOUNTTYPE_B = 2.0;
    public final double ACCOUNTTYPE_C = 2.5;
    public final double ACCOUNTTYPE_X = 5.0;
    public double deposit, totalAmount, totalInterest;
    public int option, option2, option3, option4;
    public String message;

    Scanner inputnum = new Scanner(System.in);

    public void display() {
        System.out.println("****  ACCOUNT MENU PLEASE CHECK CAREFULLY     ****");
        System.out.println("***1. Account A = 1.5, minimum deposit: 250    ***");
        System.out.println("***2. Account B = 2.0, minimum deposit: 1000   ***");
        System.out.println("***3. Account C = 1.5, minimum deposit: 250    ***");
        System.out.println("***4. Account X = 5.0, minimum deposit: 5000   ***");
        System.out.println();

        System.out.print("Enter option = ");
        option = inputnum.nextInt();
        System.out.println();

        System.out.print("Enter inital deposit: ");
        deposit = inputnum.nextDouble();
        System.out.println();

        switch (option) {
            case 1:
                totalInterest = deposit * (ACCOUNTTYPE_A / 100);
                totalAmount = deposit + totalInterest;
                message = "Total Amount to be Earned after a year on your " + deposit + " deposit is = " + totalAmount;
                if (deposit < 250) {
                    System.out.println("Insufficient deposit");

                } else {
                    System.out.println(message);
                }
                break;

            case 2:
                totalInterest = deposit * (ACCOUNTTYPE_B / 100);
                totalAmount = deposit + totalInterest;
                message = "Total Amount to be Earned after a year on your " + deposit + " deposit is = " + totalAmount;
                if (deposit < 1000) {
                    System.out.println("Insufficient deposit");

                } else {
                    System.out.println(message);
                }
                break;

            case 3:
                totalInterest = deposit * (ACCOUNTTYPE_C / 100);
                totalAmount = deposit + totalInterest;
                message = "Total Amount to be Earned after a year on your " + deposit + " deposit is = " + totalAmount;
                if (deposit < 250) {
                    System.out.println("Insufficient deposit");
                } else {
                    System.out.println(message);
                }
                break;
            case 4:
                totalInterest = deposit * (ACCOUNTTYPE_X / 100);
                totalAmount = deposit + totalInterest;
                message = "Total Amount to be Earned after a year on your " + deposit + " deposit is = " + totalAmount;
                if (deposit < 5000) {
                    System.out.println("Insufficient deposit");
                } else {
                    System.out.println(message);
                }
                break;

            default:
                System.out.println(" Invalid Selection please check the menu and try again !!! ");
        }

    }

}
