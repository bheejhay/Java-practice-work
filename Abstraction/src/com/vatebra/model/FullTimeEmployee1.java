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
public class FullTimeEmployee1 extends Employee1 {
    private double annualSalary;

    public FullTimeEmployee1() {
    }

    public FullTimeEmployee1(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public FullTimeEmployee1(double annualSalary, String name, String number) {
        super(name, number);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public double calculateMonthlyPay(){
        return getAnnualSalary()/12;
    }
}
