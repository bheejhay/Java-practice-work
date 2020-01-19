/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goodshephard.school.util;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ScannerUtil {
    
    public static int nextInt(){
        Scanner scp = new Scanner (System.in);
        int i = scp.nextInt();
        return i;
    }
    
    public static double nextDouble(){
        Scanner scp = new Scanner (System.in);
        double d = scp.nextDouble();
        return d;
    }
    
     public static String nextString(){
        Scanner scp = new Scanner (System.in);
        String s = scp.nextLine();
        return s;
}
      public static char nextChar(){
        Scanner scp = new Scanner (System.in);
        char c = scp.next().charAt(0);
        return c;
      }
}
     
