/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Supplier;

import java.util.Date;
import num.seqNum;

/**
 *
 * @author USER
 */
public class SupplierDao extends seqNum {

public String rating;
public String dateApproved;
public double fee;

    public SupplierDao() {
    }

    public SupplierDao(String rating, String dateApproved, double fee, String Sname, String supCode, String projnum, String pName) {
        super(Sname, supCode, projnum, pName);
        this.rating = rating;
        this.dateApproved = dateApproved;
        this.fee = fee;
    }

  

    
    


}
