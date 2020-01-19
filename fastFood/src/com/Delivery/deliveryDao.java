/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Delivery;

import java.util.Date;
import num.seqNum;

/**
 *
 * @author USER
 */
public class deliveryDao extends seqNum {

    public String date;
    public int qty;
    
public deliveryDao() {
    }

    public deliveryDao(String date, int qty, String Sname, String supCode, String projnum, String pName) {
        super(Sname, supCode, projnum, pName);
        this.date = date;
        this.qty = qty;
    }

}
