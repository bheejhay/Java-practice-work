/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.Teeshirt;

/**
 *
 * @author USER
 */
public class Teeshirt {

    protected int orderNum;
    private String colour;
    private double size;
    protected double price;

    public Teeshirt() {
    }

    public Teeshirt(int orderNum, String colour, double size, double price) {
        this.orderNum = orderNum;
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public double calcprice(double size) {
        return 0;
    }

}
