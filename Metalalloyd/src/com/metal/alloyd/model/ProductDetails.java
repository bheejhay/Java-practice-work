/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metal.alloyd.model;

/**
 *
 * @author USER
 */
public class ProductDetails extends Commonkey{

    private String name;
    private int alcode, empNum;
    private double thickness;

    public ProductDetails() {
    }

    public ProductDetails(String name, int alcode, int empNum, double thickness) {
        this.name = name;
        this.alcode = alcode;
        this.empNum = empNum;
        this.thickness = thickness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAlcode() {
        return alcode;
    }

    @Override
    public void setAlcode(int alcode) {
        this.alcode = alcode;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "ProductDetails{" + "name=" + name + ", alcode=" + alcode + ", empNum=" + empNum + ", thickness=" + thickness + '}';
    }
    

}
