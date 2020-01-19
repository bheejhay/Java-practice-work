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
public class FullTimeEmployee3 extends Employee3 {

    private double annualSalary;

    public FullTimeEmployee3() {
    }

    public FullTimeEmployee3(double annualSalary, String name, String number) {
        super(name, number);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double earnings() {
        return getAnnualSalary() / 12;
    }

    @Override
    public String toString() {
        return "name:" + super.getName() + "\n" + "number:"
                + super.getNumber() + "\n" + "annualSalary=" + annualSalary;
    }

}
