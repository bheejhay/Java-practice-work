/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyanything;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author USER
 */
public class Inbetween {
    int firstNum, secondNum ;
    String message ;
    
    Scanner input = new Scanner (System.in);
    
    public void displaybetween (){
        System.out.println("***Please Enter Two Numbers of your Choice***");
        System.out.print("Enter First Number: ");
        firstNum = input.nextInt();
        
        System.out.print("Enter Second Number: ");
        secondNum = input.nextInt();
        
        System.out.println (" Numbers between are: ");
        
        if (firstNum < secondNum){
            for (; firstNum < secondNum; firstNum++){
                message =  firstNum + " " ;
                System.out.print(message);
            }
        } else if(firstNum > secondNum){
            for (; firstNum>secondNum; firstNum--){
                message = firstNum + " " ;
                System.out.print(message);
            }
            System.out.println();
        }
        else
            System.out.println("Sorry there are no Numbers in between!!!");
            
            }
            
        }
  