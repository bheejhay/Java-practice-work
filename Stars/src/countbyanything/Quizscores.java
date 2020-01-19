/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyanything;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Quizscores {

    public void displayquizValue() {
        int[] score = new int[10];
        int scores = 0;
        int count = 0;
        int total = 0;
        final int QUIT = 99;
        final int MAX = 10;
        int numofStudent;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("**Enter the Students Scores below or " + QUIT + " to Exit**");
        System.out.print("Enter num of Students: ");
        numofStudent = input.nextInt();

        System.out.print("Enter Student Scores: ");
        scores = input.nextInt();

        while (scores != QUIT && scores <= 10) {

            score[count] = scores;
            total += score[count] ;           
            total++;

            if (count == MAX) {
                scores = QUIT;
            } else {
                System.out.println("Enter next Quiz Scores or " + QUIT + "to Exit= ");
                scores = input.nextInt();
            }
            System.out.println("The Scores Entered are listed Below: ");
            for (int y = 0; y < score.length; y++) {
                int i = score[y];
                System.out.println(score[y] + " ");
            }
            if (count != 0) {
                average = total * 1.0 / count;
                NumberFormat averageFormat = NumberFormat.getNumberInstance();
                averageFormat.setMaximumFractionDigits(2);
                System.out.println("\n The average is " + averageFormat.format(average));
            } else {
                System.out.println("the Score is invalid!!!");

            }
        }

    }
}
