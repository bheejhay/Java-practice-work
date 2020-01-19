/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.arrays;

/**
 *
 * @author OAdelodun
 */
public class Ex1 {
    
    public void displayArrays(){
        int[] num = new int[6];
        System.out.println("index\tcount");
        
        for (int i = 0; i < num.length; i++) {
           // int j = num[i];
            System.out.println(i + "\t" + num[i]);
            
        }
    }
    
}
