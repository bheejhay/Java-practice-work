/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.array;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class lotto {
    public void displayloto(){
        int guess, lottoDigit1, lottodigit2;
        int lottery =   (int) (Math.random()*100);
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter your Two numbers: ");
        guess= sc.nextInt();
        
        lottoDigit1= lottery/10 ;
          
    } 
}
