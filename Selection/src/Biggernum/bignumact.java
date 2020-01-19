/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biggernum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class bignumact {
    int firstnumber;
    int secondnumber;
    String message;
    
    Scanner input = new Scanner(System.in);
    
    public void display(){
        System.out.print("Enter firstnumber: ");
     firstnumber = input.nextInt();
     
        System.out.print("Enter secondnumber: ");
        secondnumber = input.nextInt();
        
        if (firstnumber>secondnumber) {
            message = "First Number Bigger";
            System.out.println(message);
            
        } else{
            message =  "Second Number Bigger";
            System.out.println(message);
            
            
        }
                    
            
        }
        
    }
            
    
    
    
