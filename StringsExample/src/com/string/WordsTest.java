/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class WordsTest {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String words1, words2, words3;
        System.out.print("Enter character words: ");
        words1 = sc1.next();

        System.out.print("Enter character words: ");
        words2 = sc1.next();

        System.out.print("Enter character words: ");
        words3 = sc2.nextLine();

        System.out.println(words1 + " to uppercase is " + words1.toUpperCase());
        System.out.println("The length of " + words1 + " is " + words1.length());
        System.out.println("Index value of M in " + words1 + " is " + words1.indexOf("M"));
        System.out.println("Character at index 2 is " + words1 + " is " + words1.charAt(2));
        if (words1.startsWith("el")) {
            System.out.println(words1 + " start with " + words2);
        } else {
            System.out.println(words1 + " do not start with " + words2);
        }

        if (words1.endsWith("el")) {
            System.out.println(words1 + " end with " + words2);
        } else {
            System.out.println(words1 + " do not end with " + words2);
        }
        
        System.out.println("First: " + words3.substring(6));
        System.out.println("First: " + words3.substring(2, 6));
    }
}
