/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strings.buffer;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class ReverseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String words;
        System.out.println("Enter words: ");
        words = sc.nextLine();
        StringBuffer s = new StringBuffer(words);
        System.out.println(s);
        s.reverse();
        System.out.println(s);

    }

}
