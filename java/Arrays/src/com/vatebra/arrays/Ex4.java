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
public class Ex4 {

    public void display() {
        int[] odd = new int[6];
        int j = 1;
        System.out.println("index\t\tcount");
        for (int i = 0; i < odd.length; i++) {
            odd[i] = j ;
            System.out.println(i + "\t\t" + odd[i]);
            j += 2;

        }
    }
}
