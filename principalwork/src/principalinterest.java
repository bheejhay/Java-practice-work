
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
public class principalinterest {
   double principal ;
   float time ;
   float rate ;
   double interest ;
   Scanner input = new Scanner (System.in);
   
   public void display(){
       System.out.print("principal= ");
       principal = input.nextDouble();
       System.out.print("time= ");
       time = input.nextFloat();
       System.out.print("rate= ");
       rate = input.nextFloat();
       interest = principal * time * rate / 100;
       System.out.println("total interest = "+ interest);
       
       
               
       
       
   }
  
           
    
}
