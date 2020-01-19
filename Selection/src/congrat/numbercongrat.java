/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congrat;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class numbercongrat {
    String message;
    int Firstnumber;
    int Secondnumber;
    int Sum;
    
    Scanner input = new Scanner(System.in);
    
    public void display(){
        System.out.print("Enter First Number: ");
        Firstnumber = input.nextInt();
        
        System.out.print("Enter Second Number: ");
        Secondnumber = input.nextInt();
        
        System.out.print("Enter Sum: ");
        Sum = input.nextInt();
        
        if (Sum == Firstnumber + Secondnumber) {
            message = "CONGRATULATIONS";
            System.out.println(message);
            
        }else{
            message = "Not Correct, Answer = ";
            Sum = Firstnumber + Secondnumber;
            System.out.println(message +  Sum);
            
            
                         
            
            
                   
        }
        
    }
    
}
