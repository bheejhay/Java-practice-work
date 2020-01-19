
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
public class Minutesconversion {
    float minutes ;
    float hours = 60 ;
    float days = 24 ;
    
    Scanner input = new Scanner(System.in);
    
    public void display() {
        System.out.println("***Time Management***");
        
        System.out.print("minutes = ");
        minutes = input.nextFloat();
        
        hours = minutes / hours;
        System.out.println("hours = " + hours);
        
        days = hours / days ;
        System.out.println("days = "+ days);
        
        System.out.println();
        
        
                
    }
    
            
    
}
