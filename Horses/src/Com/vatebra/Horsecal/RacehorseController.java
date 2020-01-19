/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.Horsecal;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RacehorseController {

    String name, colour;
    int years;
    Scanner sc = new Scanner(System.in);

    public  void displayHorse() {
        RaceHorse rose = new RaceHorse();
        System.out.println("Enter your Name: ");
        name = sc.next();
        rose.setName(name);
           
        System.out.println("Enter your Colour: ");
       colour = sc.next();
       rose.setColour(colour);

        System.out.println("Enter The birth year of your horse: ");
        years = sc.nextInt();
        rose.setYears(years);
        
        System.out.println("The colour is "+ rose.getColour()+ " and the Horse age is " + rose.getYears() + "years");
        
    }

}
