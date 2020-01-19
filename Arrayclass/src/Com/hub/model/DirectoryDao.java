/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.hub.model;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class DirectoryDao extends Directory {

    String name, phoneNum;

    Scanner sc = new Scanner(System.in);
    Directory dire = new Directory();


    public void displaydir() {

        System.out.println("Enter name: ");
        name = sc.nextLine();
        dire.setNames(name);

        System.out.println("Enter Phonenum: ");
        phoneNum = sc.nextLine();
        dire.setPhoneNum(phoneNum);
        
        
        

    }
}
