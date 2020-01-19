/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.arrays;

import java.text.Normalizer;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class GradeScore {

    double total = 0;
    int count = 1;
    double average;
    int grades;
    int[] students = new int[10];
    int result = students[0];
    int result2 = students[0];

    Scanner sc = new Scanner(System.in);

    public void displaygrade() {

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student score: ");
            students[i] = sc.nextInt();
        }

        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        average = total * 1.0 / students.length;
        System.out.println("The Class Average is= " + average);

      
        for (int i = 0; i < students.length; i++) {
            if (students[i] > result) {
                result = students[i];
            }
           
        }
        System.out.println("the maximum is: " + result);
        System.out.println("the minimum is: " + min());

    }
    
    public int min(){
        result2 = students[0];
        for (int i = 0; i < students.length; i++) {
            if(students[i] < result2){
                result2 = students[i] ;
            }
            
        }
        return result2;
    }

}
