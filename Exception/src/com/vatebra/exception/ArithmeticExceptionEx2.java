/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.exception;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class ArithmeticExceptionEx2 {

    public void display() {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        double n, d;
        try {
            System.out.print("Enter numerator: ");
            n = sc.nextDouble();
            System.out.print("Enter denominator: ");
            d = sc.nextDouble();

            System.out.println("Fractional decimal = " + nf.format(divide(n, d)));
        } catch (ArithmeticException ex) {
            System.out.println("numerator divided by zero is error");
        }catch(InputMismatchException in){
            in.printStackTrace();
            System.out.println("Letters are not required");
        }
    }

    public double divide(double numerator, double denominator) {
        return numerator / denominator;

    }
}
