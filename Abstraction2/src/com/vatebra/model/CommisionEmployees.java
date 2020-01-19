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
public class CommisionEmployees extends Employee implements IEmployee {

    private double grossSales, commisionRate;

    public CommisionEmployees() {
    }

    public CommisionEmployees(double grossSales, double commisionRate, String firstName, String lastName, String SSN) {
        super(firstName, lastName, SSN);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    @Override
    public double earnings() {
        return getCommisionRate() * getGrossSales();

    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + " You are a Commission Employee " + " Gross Sales = " + grossSales + ", commission Rate= " + commisionRate ;
    }

}
