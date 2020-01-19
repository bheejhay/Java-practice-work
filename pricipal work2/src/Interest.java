
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Interest {
    String firstname;
    String lastname;
    float rate;
    float time;
    double interest;
     Scanner input = new Scanner(System.in);
     
     public void display (){
         System.out.println("***Welcome Principal***");
         
         System.out.print("Firstname: ");
         firstname = input.next();
         
         System.out.print("Lastname: ");
         lastname = input.next();
         
         System.out.print("rate= ");
         rate = input.nextFloat();
         
         System.out.print("time= ");
         time = input.nextFloat();
         
         interest = rate * (time / 2 );
         System.out.println("Total interest= " + interest);
         
         System.out.println("*** thank you***");
         
         
         
         
     }
     
     
    
}
