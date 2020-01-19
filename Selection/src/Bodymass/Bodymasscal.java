/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bodymass;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Bodymasscal {

    double bmi;
    double underWeight;
    double overWeight;
    String message;
    double healthy;
    
    Scanner num = new Scanner(System.in);

    public void display() {
        System.out.print("Enter Bmi: ");
        bmi = num.nextDouble();

        if (bmi <= 24.5) {
            
            if (bmi >= 18.5 && bmi <= 24.5) {
            message = "You are Healthy";
            System.out.println(message);

        } else if (bmi < 18.5){
        message = "You are Underweight !!!";
        System.out.println(message);
        } 
        }else{ 
            message = "You are Overweight !!!" ;
                System.out.println(message);
                
                
        }
            
        }
        
                   

                }

    

