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
public class AppendDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s1,s2;
       
        System.out.println("Enter value ");
        s1 = sc.next();
       
        int a = 42;
        StringBuffer sb = new StringBuffer(s1);

        s2 = sb.append("a = ").append(a).append("!").append(" goood works").toString();
        System.out.println(s2);
    }

}
