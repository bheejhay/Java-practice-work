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
public class StringBufferDemo1 {

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
        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
    }

}
