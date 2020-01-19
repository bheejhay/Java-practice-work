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
public class StringBufferDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String first;
        System.out.println("Enter words: ");
        first = sc.nextLine();
        StringBuffer sb = new StringBuffer(first);
        System.out.println("buffer before = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        System.out.println("buffer new word 1 = " + sb);
        sb.setLength(5);
        System.out.println("buffer new word 2 = " + sb);
        System.out.println("buffer after = " + sb);
        System.out.println("charAt(1) after = " + sb.charAt(1));
    }

}
