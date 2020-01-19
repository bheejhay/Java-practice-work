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
public class HourlyEmployee extends Employee implements IEmployee {

    private double hourlyWage, hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double hourlyWage, double hours, String firstName, String lastName, String SSN) {
        super(firstName, lastName, SSN);
        this.hourlyWage = hourlyWage;
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return getHourlyWage() * getHours();
        }
        return 40 * getHourlyWage() + (getHours() - 40) * getHourlyWage() * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + " You are Hourly Employee and your hourly Wage is = " + hourlyWage + ", hours= " + hours ;
    }
}
    
