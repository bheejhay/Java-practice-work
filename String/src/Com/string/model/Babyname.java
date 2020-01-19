/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.string.model;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Babyname {

    String name1, name2, name3;
    String combname1, combname2, combname3;

    Scanner sc = new Scanner(System.in);

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public void displaynames() {
        System.out.println("Enter name 1: ");
        name1 = sc.next();

        System.out.println("Enter name 2: ");
        name2 = sc.next();
        System.out.println("Enter name 3: ");
        name3 = sc.next();

        StringBuffer name11 = new StringBuffer(name1);
        StringBuffer name22 = new StringBuffer(name2);
        StringBuffer name33 = new StringBuffer(name3);

        combname1 = name11.append(name2).toString();
        combname2 = name22.append(name3).toString();
        combname3 = name33.append(name1).toString();

        System.out.println(combname1);
        System.out.println(combname2);
        System.out.println(combname3);

    }

}
