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
public class CharacterInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char aChar = 'C';
        System.out.println("The character is " + aChar);
        if (Character.isUpperCase(aChar)) {
            System.out.println(aChar + " is uppercase");
        } else {
            System.out.println(aChar + " is not uppercase");
        }
        if (Character.isLowerCase(aChar)) {
            System.out.println(aChar + " is lowercase");
        } else {
            System.out.println(aChar + " is not lowercase");
        }
        aChar = Character.toLowerCase(aChar);
        System.out.println("After tolowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);
        if (Character.isLetterOrDigit(aChar)) {
            System.out.println(aChar + " is a letter or digit");
        } else {
            System.out.println(aChar + " is neither a letter nor a digit");
        }
        if (Character.isWhitespace(aChar)) {
            System.out.println(aChar + " is whitespace");
        } else {
            System.out.println(aChar + " 1s not whitespace");
        }

    }

}
