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
public class countanything {
    public void displaycount5times (){
        int num, num2 ;
        Scanner input = new Scanner (System.in);
        
        System.out.println("** Enter the number you want its multiple: ***");
        System.out.print("Enter number: ");
        num = input.nextInt();
        System.out.print("Enter the multiple: ");
        num2 = input.nextInt();
                
        
        while ( num <= 500){
            System.out.print(num + " ");
            
            num +=num2 ;
        }
                
    }
}
