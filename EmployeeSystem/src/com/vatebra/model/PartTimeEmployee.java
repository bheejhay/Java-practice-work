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
public class PartTimeEmployee extends Employee {

    private double hourlyPay;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public PartTimeEmployee(double hourlyPay, int number, String name) {
        super(number, name);
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double calculateHourlyPay(double hour) {

        if (hour > 12) {
            return hour * 150;
        } else if (hour <= 12 && hour != 0) {
            return hour * 120;
        } else {
            System.out.println("Error!!!!!!!!!");
        }
        return hour;
    }

}
