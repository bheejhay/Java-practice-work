/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.model;

/**
 *
 * @author USER
 */
public class BaseplusCommissionemployee extends CommisionEmployees implements IEmployee{
    private double baseSalary;

    public BaseplusCommissionemployee() {
    }

    public BaseplusCommissionemployee(double baseSalary, double grossSales, double commisionRate, String firstName, String lastName, String SSN) {
        super(grossSales, commisionRate, firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return (getCommisionRate() * getGrossSales()) + getBaseSalary() ;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + " You are a Base plus Commission Employee" + " Your Base Salary is = " + baseSalary ;
    }
    
    
}
