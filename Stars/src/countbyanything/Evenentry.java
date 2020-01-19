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
public class Evenentry {
    int num ;
    
    Scanner input = new Scanner (System.in);
    
    public void displayEvennum(){
        System.out.println("Enter any Even Number of your choice: ");
        System.out.print("Enter Number: ");
        num = input.nextInt();
        
        if(num %2== 0){
            for(; num < 1000; num+=2){
                System.out.print(num+ " ");
            }
            System.out.println();
            System.out.println("*** Good job !!! ***");
            
        }else{
            System.out.println("*** Error this is not an even, please try again !!! *** ");
            displayEvennum();
        }
    }
    
}
