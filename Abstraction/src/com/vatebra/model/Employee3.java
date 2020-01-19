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
public abstract class Employee3 {

    private String name, number;

    public Employee3() {
    }

    public Employee3(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "name: " + name + "\n" + " number=" + number;
    }

}
