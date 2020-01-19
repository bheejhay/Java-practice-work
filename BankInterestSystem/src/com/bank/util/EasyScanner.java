/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.util;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class EasyScanner {

    public static int nextInt() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }

    public static double nextDouble() {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        return d;
    }

    public static String nextString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    public static char nextChar() {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        return c;
    }

}
