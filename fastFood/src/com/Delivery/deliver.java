/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Delivery;

import com.Dao.utilimpl;

/**
 *
 * @author USER
 */
public class deliver extends deliveryDao{
    deliveryDao del = new deliveryDao();
    utilimpl imp = new utilimpl();
    
    public void displaydelivery(){
        System.out.print("Enter Project Number: ");
        String projno = utilimpl.nextline();
        del.setProjnum(projno);
        
        System.out.print("Enter Supplier Code: ");
        String supco = utilimpl.nextline();
        del.setSupCode(supco);
        
        System.out.print("Enter Delivery Date: ");
        String deliv = utilimpl.nextline();
        
        System.out.print("Enter Quantity: ");
        int qaun = utilimpl.nextInt();
        
    }
}
