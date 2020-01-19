/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.dao;

import in.co.model.arrayintegers;

/**
 *
 * @author USER
 */
public class arayInte extends arrayintegers {

    public double average;

    public arayInte() {
    }

    public arayInte(int numbers) {
        super(numbers);
    }

    public double average(int total) {
        average = total* 1.0/ num.length;
        
        return average;
    }

    public void max(int total) {
        System.out.println("Numbers higher than Average are");
        for (int i = 0; i < num.length; i++) {
            if (num[i] > average(total)) {
                System.out.println(num[i]);

            }

        }

    }

   
}
