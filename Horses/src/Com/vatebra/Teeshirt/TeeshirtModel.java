/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.Teeshirt;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TeeshirtModel {

    String colour;
    final double PRICE1 = 22.99;
    final double PRICE2 = 19.99;
    double tprice;
    int option, num;
    double size;
    Scanner sc = new Scanner(System.in);

    public void displayTeeshirt() {
        CustomTeeshirt custom = new CustomTeeshirt();

        System.out.println("Enter Desired Colour: ");
        colour = sc.next();
        custom.setColour(colour);

        System.out.println("Enter how many Piece(s): ");
        num = sc.nextInt();
        custom.setOrderNum(num);

        System.out.println("************************************************");
        System.out.println("***Enter the size of Teeshirt you desire**");
        System.out.println("*** 1.Size 1 (XXL & XXXL) = $22.99 *******");
        System.out.println("*** 2.ANY OTHER SIZE = $19.99 ************");
        System.out.println("*** 3. EXIT                   ************");
        System.out.println("************************************************");

        System.out.println("Enter option: ");
        option = sc.nextInt();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMaximumFractionDigits(2);
        switch (option) {
            case 1:
                size = 22.99;
                tprice = custom.calcprice(size);
                System.out.println("The Total price of your order is = " + nf.format(tprice));
                break;

            case 2:
                size = 19.99;
                tprice = custom.calcprice(size);
                System.out.println("The total price of your order is = " + tprice);
                break;

            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("invalid entry try again!!!");
                displayTeeshirt();
        }

    }

}
