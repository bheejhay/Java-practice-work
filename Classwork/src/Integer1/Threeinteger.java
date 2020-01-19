/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integer1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Threeinteger {

    public int num1, num2, num3, sum, product;
    public String message;
    public double average;
    

    Scanner input = new Scanner(System.in);

    public void displayinter() {
        System.out.println("*** Enter three numbers of your choice: *** ");

        System.out.print(" Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("enter third number: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        System.out.println("Sum of the numbers= " + sum);

        product = num1 * num2 * num3;
        System.out.println("Product of the numbers= " + product);

        average = sum / 3;
        System.out.println("Average of the numbers= " + average);

        if (num1 > num2) {
            if(num1>num3){
                System.out.println(num1 + " is the largest");
            }else{
                System.out.println(num3 + " is the largest");
            }
        }else{
            if(num2>num3){
                System.out.println(num2 + " is the largest");
            }else{
                System.out.println(num3 + " is the largest");
                
                if(num1<num2){
                    if(num1<num3){
                        System.out.println(num1 + " is the lowest");
                    }else{
                        System.out.println(num3 +" is the lowest");
                }
                }else{
                        if(num2<num3){
                            System.out.println(num2 + " is the lowest");
                        }else{
                            System.out.println(num3 + " is the lowest");
                        
                        }
                        }
            }
        }
        
    }

}
