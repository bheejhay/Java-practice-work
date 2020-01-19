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
public class CommisionEmployee extends Employee {

    private int people;
    private double salary, commission;

    public CommisionEmployee() {
    }

    public CommisionEmployee(int people) {
        this.people = people;
    }

    public CommisionEmployee(int people, int number, String name) {
        super(number, name);
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    public double calcualtecommission(int people, double salary) {
        if (people < 20) {
            return 4000 + 1.0 * salary;

        } else if (people > 20 && people < 50) {
            return salary + 5000 * 1.0;

        } else if (people > 50 && people < 100) {
            return salary + 6000 * 1.0;

        } else if (people > 100) {
            return salary + 10000;
            
        }else if (people == 0){
            return salary - (2000 * 1.0) ;
            
        }else{
            System.out.println("incorrect entry !!! ");

        }
        return commission;
    }
}
