
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
public class Bodymassindex {

    //declearing  varibles
    double weight;
    double height;
    double bmi;
    Scanner input = new Scanner(System.in);

    public void display() {
        System.out.print("value of weight =");
        weight = input.nextDouble();
        System.out.print("value of height=");
        height = input.nextDouble();
        bmi = weight / (height * height);
        System.out.print("value of bmi = " + bmi);
        
        
        
        
        
        
        

    }

}
