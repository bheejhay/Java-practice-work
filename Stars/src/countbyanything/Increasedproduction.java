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
public class Increasedproduction {

    int production;
    double rate = 0.06;
    int months;
    double output;

    Scanner input = new Scanner(System.in);

    public void displayproductoutput() {
        System.out.println("***Production Output of Workers***");
        System.out.print("Enter production currently: ");
        production = input.nextInt();
        System.out.print("Enter number of months: ");
        months = input.nextInt();
        output = production * rate;
        
        if (months <= 24) {
                System.out.println(output + " output for " + months + "months");
                System.out.println("Worker does not deserve a raise yet");
            
        } else if (production > 7000) {
            System.out.println(output + "output is due for a raise in Salary ");
        } else {
            System.out.println("Worker does not deserve a raise yet ");
        }
    }
}
