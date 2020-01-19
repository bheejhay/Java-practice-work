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
public class SalariedEmployee extends Employee implements IEmployee {

    private double weeklySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, String SSN) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;

    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return super.toString() + "\n"  + " Your weeklySalary is = " + weeklySalary;
    }
}