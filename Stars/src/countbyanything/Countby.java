/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyanything;

/**
 *
 * @author USER
 */
public class Countby {

    public void displaycount() {
        for (int counter = 5; counter <= 500; counter += 5) {
            if (counter == 55 ) {
                System.out.println();
                
            }
            System.out.print(counter + " ");
            if (counter == 100){
                System.out.println();
                System.out.println(counter + " ");
            }

        }
        System.out.println();

    }
}
