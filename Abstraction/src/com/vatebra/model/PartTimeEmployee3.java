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
public class PartTimeEmployee3 extends Employee3 {

    private double hourlyPay;
    private int absent;
    public final int DAYS = 5;

    public PartTimeEmployee3() {
    }

   
    public PartTimeEmployee3(double hourlyPay, String name, String number) {
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

    @Override
    public String toString() {
        return "name:" + super.getName() + "\n" + "number:" +
                super.getNumber() + "\n" + "hourlyPay=" + hourlyPay + "\n" + 
                "absent:" + absent + "\n"  + "DAYS=" + DAYS;
    }
    
    

}
