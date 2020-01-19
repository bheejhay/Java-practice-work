/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numberequal;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Numberstrenght {
    String message;
    int firstnumber;
    int secondnumber;
    
    
    Scanner input = new Scanner(System.in);
    
    public void display() {
        System.out.print(" Enter firstnumber; ");
        firstnumber = input.nextInt();
        
        System.out.print("Enter secondnumber; ");
        secondnumber = input.nextInt();
        
        if (firstnumber ==secondnumber) {
         message = "Numbers are Equal";
         System.out.println(message);
         
    } else{
            message = "Numbers not Equal";
            System.out.println(message);
            
                 
                 }
         
        
            
        }
                
    }
            
    
    
    

