/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.array;

/**
 *
 * @author USER
 */
public class productcheck {

    private final double PRODUCT1 = 2.98;
    private final double PRODUCT2 = 4.50;
    private final double PRODUCT3 = 9.98;
    private final double PRODUCT4 = 4.49;
    private final double PRODUCT5 = 6.87;
    private double productPrice, totalPrice;

public productcheck(){
    
}

    public double getPRODUCT1() {
        return PRODUCT1;
    }

    public double getPRODUCT2() {
        return PRODUCT2;
    }

    public double getPRODUCT3() {
        return PRODUCT3;
    }

    public double getPRODUCT4() {
        return PRODUCT4;
    }

    public double getPRODUCT5() {
        return PRODUCT5;
    }



    public double calculatetotalPrice(double p, int q) {
        return p * q;
    }
}

