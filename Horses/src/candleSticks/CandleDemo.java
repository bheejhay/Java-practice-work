/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candleSticks;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CandleDemo {
    
    public void displaycandle(){
        ScentedCandle scent = new ScentedCandle();
        
        double fprice,height ;
        String colour, scenty ;
        final int PRICE = 3 ;
        
        Scanner into = new Scanner(System.in);
        
        System.out.print("Enter Colour of Candle: ");
        colour=into.next();
        scent.setColour(colour);
        
        System.out.print("Enter your the Height of the Candle: ");
        height = into.nextDouble();
        scent.setHeight(height);
        
        System.out.print("Enter the Scent of your candle: ");
        scenty = into.next();
        scent.setScent(colour);
        
        scent.calcheight(scent.height) ;
        
        
    }
    
}
