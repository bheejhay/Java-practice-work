/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dao;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class utilimpl {
   public  static int nextInt(){
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       return i;
   } 
   public static String nextline(){
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       return s;
   }
   public static double nextDouble(){
       Scanner sc = new Scanner (System.in);
       double d = sc.nextDouble();
       return d;
       

   }
}
