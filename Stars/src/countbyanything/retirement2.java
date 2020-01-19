/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyanything;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class retirement2 {

    int years;
    double invest;
    double totalInvest, rate = 0.04, rate1;

    Scanner input = new Scanner(System.in);

    public void displayretire() {
        System.out.println("Retirement forcast of workers");
        System.out.println("Enter years: ");
        years = input.nextInt();
        System.out.println("Enter Investment every year: ");
        invest = input.nextDouble();

        rate1 = rate * years ;
        totalInvest = rate + invest;

        if (invest > 0) {
            System.out.println("Total amount to be earned after " + years + " is " + totalInvest);

        } else {
            while (invest <= 0) {
                System.out.println("your investment cannot be lesser or equal to 0 naira try again !!!");
                System.out.println("Enter Investment every year: ");
                invest = input.nextDouble();
            }
        }
        invest++;
        totalInvest = rate * years + invest;
        System.out.println("Total amount to be earned after " + years + "years is " + totalInvest);

    }
}
