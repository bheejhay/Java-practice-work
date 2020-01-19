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
public class WordsTest2 {

    Scanner sc1 = new Scanner(System.in);
    String words1, words2;

    public void display() {

        System.out.print("Enter character words: ");
        words1 = sc1.next();
        System.out.println(words1 + " to uppercase is " + toUpperCase());
        System.out.println("The length of " + words1 + " is " + wordsLength());
        System.out.println("Index value of M in " + words1 + " is " + wordsIndex(words1));
        
    }

    public String toUpperCase() {
        return words1.toUpperCase();
    }
    
    
    public int wordsLength(){
        return words1.length();
    }
    
    public int wordsIndex(String word){
        return words1.indexOf(word.indexOf("M"));
    }

}
