/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maps;

import java.util.*;

/**
 *
 * @author USER
 */
public class mapsers {

    HashMap<String, String> hp = new HashMap<>();
    TreeMap<Integer, String> tp = new TreeMap<>();
    LinkedHashMap<Integer, Double> lm = new LinkedHashMap<>();

    public void displayHashMaps() {
        if (hp.isEmpty()) {
            System.out.println("Username and password is empty");
        }
        hp.put("Bolaji", "laji1234");
        hp.put("Micheal", "miko78");
        hp.put("Damilola", "damo29");
        hp.put("Tunji", "tunji02");
        System.out.println(hp);
        System.out.println();

        if (hp.containsKey("Bola")) {
            System.out.println("the Username is already existing");
        } else {
            hp.put("bola", "balo1234");
            System.out.println("Username and Password suucefully added");
        }
        System.out.println();
        System.out.println(hp);
        System.out.println();
        System.out.println("Username\tPassword");

        Set<String> userKey = hp.keySet();
        for (String key : userKey) {

            String password = hp.get(key);
            System.out.println(key + " \t- " + password);

        }
        if (hp.isEmpty()) {
            System.out.println("Username and password empty");
        } else {
            System.out.println("Username and password is added");
        }

    }
    public void displaylinkes(){
        tp.put(14, "bolaji");
        tp.put(17, "bolaji");
        tp.put(19, "damilola");
        tp.put(20, "micheal");
        tp.put(22, "tunji");
        System.out.println(tp);
        System.out.println();
        
        System.out.println("Id \t username");
        Set<Integer> tree = tp.keySet();
        for (Integer trip : tree) {
            
            String username = tp.get(trip);
            System.out.println(trip + " \t "+ username);
            
        }
    }
    
}
