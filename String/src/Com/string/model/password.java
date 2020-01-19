/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.string.model;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author USER
 */
public class password {

    Scanner sc = new Scanner(System.in);
    char password;
    boolean upper;
    char upper1, lower1;

    Character[] words1 = new Character[5];
    Character[] words2 = new Character[5];
    Character[] words3 = new Character[5];

    public void displaypass() {
        System.out.println("Note: password must contain at least (2 uppercase letters, 3 lowercase and 1 digit)");
        System.out.println("Enter password: ");
        password = sc.next().charAt(0);

        if (upper) {

            for (int i = 0; i < words1.length; i++) {
                words1[i] = password;
            }
            if (Character.isUpperCase(password)) {
                if (password >= 2) {
                    System.out.println("password added");
                } else {
                    System.out.println("upper Case is less than 2");
                }
            } else {
                System.out.println("no upper case added");

            }

            for (int i = 0; i < words2.length; i++) {
                password = words2[i];
            }
            if (Character.isLowerCase(password)) {
                if (password >= 3) {
                    System.out.println("password added");
                } else {
                    System.out.println("Lower Case is less than 3");

                }
            } else {
                System.out.println("no lowercase added");
            }

            for (int i = 0; i < words3.length; i++) {
                password = words3[i];
            }
            if (Character.isDigit(password)) {
                if (password > 1) {
                    System.out.println("password added");
                } else {
                    System.out.println(" digit is less than 1");

                }

            } else {
                System.out.println("no digit added");
            }
            System.out.println("password succefully added");
        } else {
            System.out.println(" please folow the rules");
        }

    }
}
