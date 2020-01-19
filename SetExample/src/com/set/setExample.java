 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author USER
 */


public class setExample {

    TreeSet<String> ts = new TreeSet<>();
    HashSet<String> hs = new HashSet<>();
    LinkedHashSet<String> ls = new LinkedHashSet<>();

    public void displayts() {
        ts.add("Micheal");
        ts.add("Bolaji");
        ts.add("Damilola");

        for (String t : ts) {
            System.out.println(t);
        }
        System.out.println(ts.addAll(ts));
        System.out.println();
    }

    public void displayhs() {
        hs.add("Micheal");
        hs.add("Bolaji");
        hs.add("Damilola");

        for (String h : hs) {
            System.out.println(h);
        }
        System.out.println(hs.addAll(hs));
          System.out.println();
    }
    public void displayls () {
        ls.add("Micheal");
        ls.add("Bolaji");
        ls.add("Damilola");

        for (String l : ls) {
            System.out.println(l);
        }
        System.out.println(ls.addAll(ls));
    }

}

