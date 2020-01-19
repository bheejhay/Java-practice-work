/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class TryToCompareString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String aName = "Michael";
        String anotherName;
        System.out.print("Enter name: ");
        anotherName = sc.next();
        
        if(aName == anotherName){
            System.out.println(aName + " equals " + anotherName);
        }else{
            System.out.println(aName + " not equals " + anotherName);
        }
    }
    
}
