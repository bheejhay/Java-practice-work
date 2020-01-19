/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.Smash;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SugarDemo {
    String name,idnum;
    int leve, score,hscore;
    
    Scanner sc = new Scanner(System.in);
    public void displaysugar(){
        PremiumSugarSmash sma = new PremiumSugarSmash();
        
        System.out.println("Enter Name: ");
        name= sc.next();
        sma.setName(name);
        
        System.out.println("Enter Identification Number: ");
        idnum=sc.next();
        
            
        }
    }
    

