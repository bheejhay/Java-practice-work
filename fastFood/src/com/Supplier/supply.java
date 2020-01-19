/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Supplier;

import com.Dao.utilimpl;
import java.util.Date;

/**
 *
 * @author USER
 */
public class supply extends SupplierDao {

    utilimpl imp = new utilimpl();
    SupplierDao sup = new SupplierDao();

    public void displaysupply() {
        System.out.print("Enter Supplier code: ");
        String supCode = utilimpl.nextline();
        sup.setSupCode(supCode);

        System.out.print("Enter Supplier Name: ");
        String Sname = utilimpl.nextline();
        sup.setSname(Sname);

        System.out.print("Enter Rating: ");
        String rating = utilimpl.nextline();

        System.out.print("Enter Date Approved: ");
        String datein = utilimpl.nextline();
        
        System.out.println("Enter Amount of Fee: ");
        double fee = utilimpl.nextDouble();
    }
}
