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
public class PartTimeEmployee2 extends Employee2 {

    private double hourlyPay;
    private int absent;
    public final int DAYS = 5;

    public PartTimeEmployee2() {
    }

    public PartTimeEmployee2(double hourlyPay, String name, String number) {
        super(name, number);
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    @Override
    public double earnings() {
        if (getAbsent() > 0) {
            return (DAYS - getAbsent()) * getHourlyPay();
        }

        return DAYS * getHourlyPay();
    }

}
