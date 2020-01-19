/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project;

import com.Dao.utilimpl;

/**
 *
 * @author USER
 */
public class projectry extends projectDao {

    projectDao proj = new projectDao();
    utilimpl imp = new utilimpl();
    
    public void displayprojects() {
        System.out.print("Enter Project Number: ");
        String projnum = utilimpl.nextline();
        proj.setProjnum(projnum);
        
        System.out.print("Enter Project Name: ");
        String Projname = utilimpl.nextline();
        proj.setpName(Projname);
        
        System.out.print("Enter Location: ");
        String loc = utilimpl.nextline();
        
        System.out.print("Enter Start Date: ");
        String date = utilimpl.nextline();
        
        System.out.print("Enter manager name: ");
        String mgr = utilimpl.nextline();
        
    }
    
}
