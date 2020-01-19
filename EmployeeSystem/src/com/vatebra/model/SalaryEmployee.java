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
public class SalaryEmployee extends Employee {
    
    private double salary;
    private int absent;

    public SalaryEmployee() {
    }

    public SalaryEmployee(double salary) {
        this.salary = salary;
    }

    public SalaryEmployee(double salary, int number, String name) {
        super(number, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }
    
    public double calculateSalary(double salary,int absent){
        if(absent == 0){
            return salary;
        }
        
        return salary - (salary * 1.0/30 * absent);
    }
}
