/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.set;

import java.util.*;

/**
 *
 * @author USER
 */
public class setExample2 {


        HashSet<String> registrationNumber = new HashSet();
        TreeSet<String> registrationnum2 = new TreeSet();

    

    public void displayRegistration() {
        registrationNumber.add("V53PLS");
        registrationNumber.add("X85ADZ");
        registrationNumber.add("L22SBG");
        registrationNumber.add("W79TRV");

        for (String regNum : registrationNumber) {
            if (regNum.charAt(0) > 'T') {
                System.out.println(regNum);
            }
        }
        System.out.println();
        Iterator<String> regNum3 = registrationNumber.iterator();
        while (regNum3.hasNext()) {
            String result = regNum3.next();
            if (result.charAt(0) < 'T') {
                regNum3.remove();
                System.out.println(result);
            }
        }
        System.out.println();

        boolean ok = registrationNumber.add("V53PLLL");
        if (ok) {
            registrationnum2.addAll(registrationNumber);
            System.out.println(registrationnum2);
            System.out.println("The registration size is " + registrationNumber.size());
            System.out.println("Successfully added!!!");
        } else {
            System.out.println("value is already existing");
        }
    }

}

