/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.solve;

import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class ExchangeRate {

    double amount, rate;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter amount: ");
        amount = sc.nextDouble();
        System.out.print("Enter exchange rate: ");
        rate = sc.nextDouble();
        double s = sumOfMoney(amount);
        double ex = exchangeRate(rate);
        double c = convert(s, ex);
        System.out.println("Total amount after conversion: " + c);

    }

    public double sumOfMoney(double a) {
        return a;
    }

    public double exchangeRate(double r) {
        return r;
    }

    public double convert(double a, double r) {
        return sumOfMoney(a) * exchangeRate(r);
    }
}
