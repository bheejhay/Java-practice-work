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
public class Inspiration {

    String inp2;
    int count = 0;
    String inp = "you are the driver of your life do you get";
    String[] split = inp.split(" ");
    String[] split2 = inp2.split(" ");

    Scanner sc = new Scanner(System.in);

    public void displayinspire() {
        System.out.println("Enter your favorite Quote: ");
        inp2 = sc.nextLine();

        System.out.println("Number of spaces in your Quote is: " + split.length);
        System.out.println("Number of spaces in your Quote is: " + split2.length);

    }
}
