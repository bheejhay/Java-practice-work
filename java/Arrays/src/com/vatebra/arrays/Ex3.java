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
public class Ex3 {
    
    public void total(){
        int[] age = {12,13,9,8,6,5};
        int total = 0;
        
        for (int i = 0; i < age.length; i++) {
            //total = total + age[i];
            total += age[i];
            
        }
        System.out.println("total = " + total);
    }
    
}
