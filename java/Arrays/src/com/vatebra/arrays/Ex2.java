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
public class Ex2 {
    
    public void displayArrays(){
        int[] age = {12,13,9,8,6,5};
        System.out.println("index\t\tcount");
        
        for (int i = 0; i < age.length; i++) {
            System.out.println(i+ "\t\t" + age[i]);
            
        }
    }
    
}
