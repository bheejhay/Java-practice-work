/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.hub.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DirectoryDaoimpl extends Directory{
    Directory dire = new Directory();
    Scanner sc = new Scanner(System.in);
    String phone;
    
    List<String> phoneNum = new ArrayList<>();
    List<String> name = new ArrayList<>();
    
    public void displaydir2(){
        name.add(dire.getNames());
        for (String nam : name) {
            System.out.println(nam);
            
        }
        
        phoneNum.add(dire.getPhoneNum());
        for (String phone : phoneNum) {
            System.out.println(phone);
            
        }
        
        if(name ==null){
            System.out.println("Enter phone number: ");
            phoneNum.add(sc.nextLine());

            System.out.println("Enter Name: ");
            name.add(sc.nextLine());
                    
        }
    }
}
