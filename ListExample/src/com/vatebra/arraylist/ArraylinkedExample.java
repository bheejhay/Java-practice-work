/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.arraylist;

import java.util.*;

/**
 *
 * @author USER
 */
public class ArraylinkedExample {

    List<String> printerJob1 = new ArrayList<>();
    List<String> printerJob2 = new LinkedList<>();

    public void displayprinterjob1() {
        printerJob1.add("Myletter.doc");
        printerJob1.add("MyFoto.jpg");
        printerJob1.add("result.xls");
        printerJob1.add("Chapter.doc");
        printerJob1.add(1, "Bolaji.doc");
        System.out.println("old" + printerJob1);
        printerJob1.set(3, "result.jpg");
        System.out.println("New" + printerJob1);
        System.out.println("what is the index of the result.jpg is = " +printerJob1.indexOf("result.jpg") );
        System.out.println();
        
        for (String printer1 : printerJob1) {
            System.out.println(printer1);
        }
        System.out.println();
        printerJob1.forEach((printer1) -> {
            System.out.println(printer1);
        });
        System.out.println();
        for (int i = 0; i < printerJob1.size(); i++) {
            String get = printerJob1.get(i);
            System.out.println(get);
        }
                System.out.println("New" + printerJob1);
        int index = printerJob1.indexOf("my foto.jpg");
        if (index != -1){
            System.out.println("my foto.jpg is at index "+ index);
        }else{
            System.out.println("my foto.jpg does not exist");
        }
            
        }
    

    public void displayprinterjob2() {
        printerJob2.add("Myletter.doc");
        printerJob2.add("MyFoto.jpg");
        printerJob2.add("result.xls");
        printerJob2.add("Chapter.doc");
        System.out.println("old" + printerJob1);
        printerJob2.add(2, "micheal.doc");
        printerJob2.set(3, "result.jpg");
        System.out.println("New" + printerJob2);
    }

}
