/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.poem;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Modelpoem {

    public void displaypoem() {
        String name;
        int numLines, option;

        Couplet cou = new Couplet();
        Limerick lim = new Limerick();
        Haiku hai = new Haiku();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println(" ");
        
        System.out.println("Menu of Poems");
        System.out.println("1. Couplet");
        System.out.println("2. Limerick");
        System.out.println("3. Haiku ");
        System.out.println("4. Exit  ");

        System.out.println("option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("The Number of Lines For Couplet is " + cou.getLines());
                displaypoem();

                break;

            case 2:
                System.out.println("The Number of Lines For Limerick is " + lim.getLines2());
                displaypoem();

                break;
            case 3:
                System.out.println("The Number of Lines For Haiku is " + hai.getLINES3());
                displaypoem();

                break;
            case 4:
                System.exit(0);

            default:
                System.out.println("Invalid entry try again!!!");
                displaypoem();

        }

    }

}
