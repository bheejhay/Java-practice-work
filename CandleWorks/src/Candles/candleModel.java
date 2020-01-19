/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candles;

/**
 *
 * @author USER
 */
public class candleModel {

    private String color;
    protected double height;
    private final double PRICE = 2;
    protected double tPrice;

    public candleModel() {
    }

    public candleModel(String color, double height) {
        this.color = color;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcheight() {
        return height;
    }

    public void calcheight(double height) {
        this.height = height;
        tPrice = PRICE * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPRICE() {
        return PRICE;
    }

    public double gettPrice() {
        return tPrice;
    }

    public void settPrice(double tPrice) {
        this.tPrice = tPrice;
    }

}
