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
public class Sumarray {

    int sum = 0;
    final int MAX_NUM = 10;
    int k = 0;
    int[] num = new int[MAX_NUM];

    Scanner sc = new Scanner(System.in);

    public void displaysums() {
        System.out.print("Enter 10 Numbers of your choice:" + " ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            sum += num[i];

        }
        System.out.println("The Sum of the 10 numbers is : " + sum);
    }

}
