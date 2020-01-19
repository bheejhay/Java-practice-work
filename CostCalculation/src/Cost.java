/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OAdelodun
 */
public class Cost {
    //declaring variables
    double cost;
    double tax;
    double price;
    
    public void calculateCost(){
        price = 500;
        price +=300;
        System.out.println("Price =  " +price);
        tax = 17.5;
        tax /=5;
        System.out.println("Tax = " + tax);
        cost = price*(1 + tax/100);
        System.out.println("Total cost = " +cost);
    }
}
