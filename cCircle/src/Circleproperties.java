
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Circleproperties {

    double PIE = 3.1416;
    double area;
    double circumference;
    double radius;

    Scanner input = new Scanner(System.in);
    
    public void display () {
        System.out.print("value of radius = ");
        radius = input.nextDouble();
        
        area = PIE * radius * radius;
        System.out.print("value of area = " +area);
        area = input.nextDouble();
        
        circumference = 2 * PIE * radius ;
        System.out.print("value of circumference = " + circumference);
        circumference = input.nextDouble();
        
        
                
             
                
    }
    
}
