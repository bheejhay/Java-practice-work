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
public class WordsCount {

    String words;

    Scanner sc = new Scanner(System.in);

    public void displaywords() {
        System.out.print("Enter words: ");
        words = sc.nextLine();
        System.out.println(words + " has " + wordings() + " character");

    }

    public int wordings() {
        if (Character.isLetter(0)) {
        }
        return words.length();
    }
}
