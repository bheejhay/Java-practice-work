/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.model;

/**
 *
 * @author OAdelodun
 */
public class PartTimeEmployee1 extends Employee1 {

    private double hourlyPay;
    public final int DAYS = 5;

    public PartTimeEmployee1() {
    }

    public PartTimeEmployee1(double hourlyPay, String name, String number) {
        super(name, number);
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double calculateWeeklyPay(int absent) {
        if (absent > 0) {
            return (DAYS - absent) * getHourlyPay();
        }

        return DAYS * getHourlyPay();
    }

}
