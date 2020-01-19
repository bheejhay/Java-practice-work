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
public class OrdersDetails extends Commonkey {

    private int custNum, qty;
    private String date;

    public OrdersDetails() {
    }

    public OrdersDetails(int custNum, String date, int qty) {
        this.custNum = custNum;
        this.date = date;
        this.qty = qty;
    }

    public OrdersDetails(int custNum, String date, int qty, int alcode) {
        super(alcode);
        this.custNum = custNum;
        this.date = date;
        this.qty = qty;
    }

    public int getCustNum() {
        return custNum;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getAlcode() {
        return alcode;
    }

    public void setAlcode(int alcode) {
        this.alcode = alcode;
    }

    @Override
    public String toString() {
        return "OrdersDetails{" + "custNum=" + custNum + ", date=" + date + ", qty=" + qty + '}';
    }

}
