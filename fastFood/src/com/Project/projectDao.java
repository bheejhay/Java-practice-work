/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project;

import java.util.Date;
import num.seqNum;

/**
 *
 * @author USER
 */
public class projectDao extends seqNum {

    public String location, mgr;
    public String startDate;

    public projectDao() {
    }

    public projectDao(String location, String mgr, String startDate, String Sname, String supCode, String projnum, String pName) {
        super(Sname, supCode, projnum, pName);
        this.location = location;
        this.mgr = mgr;
        this.startDate = startDate;
    }


}
