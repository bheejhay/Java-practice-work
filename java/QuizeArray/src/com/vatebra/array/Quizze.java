/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vatebra.array;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author OAdelodun
 */
public class Quizze {

    public void displayAverageOfQuiz() {
        int[] scores = new int[10];
        int score = 0;
        int count = 0;
        int total = 0;
        double average;
        final int QUIT = 999;
        final int MAX = 10;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quiz score or " + QUIT + " to quit >>");
        score = input.nextInt();
        while (score != QUIT && score <= 100) {

            scores[count] = score;
            total += scores[count];
            ++count;
            if (count == MAX) {
                score = QUIT;
            } else {
                System.out.print("Enter next quiz score or " + QUIT + " to quit >> ");
                score = input.nextInt();
            }
        }
        System.out.println();
        System.out.print("The scores entered were: ");
        for (int x = 0; x < count; ++x) {
            System.out.print(scores[x] + " ");
        }
        if (count != 0) {
            average = total * 1.0/count;
            NumberFormat averageFormat = NumberFormat.getNumberInstance();
            averageFormat.setMaximumFractionDigits(2);
            System.out.println("\n The average is " + averageFormat.format(average));
        } else {
            System.out.println("No scores were entered.");

        }
    }
}
