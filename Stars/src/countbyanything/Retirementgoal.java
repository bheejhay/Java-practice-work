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
public class Retirementgoal {

    int years;
    double invest, totalInvest;

    Scanner input = new Scanner(System.in);

    public void displayretirement() {
        System.out.println("**your retirement plan are as follows**");
        System.out.print("Enter num of years: ");
        years = input.nextInt();
        System.out.print("Enter investment every years: ");
        invest = input.nextDouble();
       
        totalInvest = invest * years * 1.0;

        if (invest > 0) {
            System.out.println("Total investment at the end of " + years + "years is " + totalInvest);
            
        }else{
            while (invest <= 0) {
                System.out.println("You investment cannot lesser or equal to 0 naira try again !!! ");
                System.out.print("Enter investment every year: ");
                invest = input.nextDouble();
                invest++;
               
                System.out.println("Total investment at the end of " + years + "years is " + totalInvest);

            }

        }
    }

}
