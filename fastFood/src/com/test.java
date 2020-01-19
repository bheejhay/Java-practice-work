/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.Dao.utilimpl;
import com.Delivery.deliver;
import com.Project.projectry;
import com.Supplier.supply;

/**
 *
 * @author USER
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        utilimpl imp = new utilimpl();
        supply sup = new supply();
        deliver del = new deliver();
        projectry proj = new projectry();
        
        System.out.println("choose your option below: ");
        System.out.println("1. Supply");
        System.out.println("2. Deliver");
        System.out.println("3. Project");
        System.out.println("4. exit");
        
        System.out.print("Enter your option: ");
        int option = utilimpl.nextInt();
        
        switch(option){
            case 1:
                sup.displaysupply();
                break;
                
            case 2:
                del.displaydelivery();
                break;
                
            case 3:
                proj.displayprojects();
                break;
                
            case 4:
                System.exit(0);
                
        }
                
        
    }
    
}
