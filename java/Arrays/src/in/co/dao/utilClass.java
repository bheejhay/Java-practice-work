/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.dao;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class utilClass {
    
    public static int nextint(){
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    return i;
    }
    
    public static double nextdouble(){
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        return d;
    }

}
