/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candleSticks;

/**
 *
 * @author USER
 */
public class Candle {

    private String colour;
    protected double height;
    private final int PRICE = 2;
    protected double tprice;

    public Candle() {
    }

    public Candle(String colour, double height) {
        this.colour = colour;
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double calcheight() {
        return height;
    }

    public void calcheight(double height) {
        this.height = height; 
        tprice = PRICE * height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getPRICE() {
        return PRICE;
    }

    public double gettprice() {
        return tprice;
    }

    public void settprice(double tprice) {
        this.tprice = tprice;
    }
}
