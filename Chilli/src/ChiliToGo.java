
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OAdelodun
 */
public class ChiliToGo {
    double ADULT_MEAL = 7;
    double CHILD_MEAL = 4;
    int adultMealOrder;
    int childMealOrder;
    String firstName;
    String lastName;
    double totalForChildMeal;
    double totalForAdultMeal;
    double totalForAllMeals;
    Scanner input = new Scanner(System.in);
  
    
    public void display(){
        System.out.print("Enter first name: ");
        firstName = input.next();
        System.out.print("Enter last name: ");
        lastName = input.next();
        System.out.print("number ordered for adult meal: ");
        adultMealOrder = input.nextInt();
        System.out.print("number ordered for child meal: ");
        childMealOrder = input.nextInt();
        
        totalForChildMeal = CHILD_MEAL * childMealOrder;
        System.out.println("Total money collected for child meal: " + totalForChildMeal);
        
        totalForAdultMeal = ADULT_MEAL * adultMealOrder;
        System.out.println("Total money collected for adult meal:" + totalForAdultMeal);
        
        totalForAllMeals = totalForChildMeal + totalForAdultMeal;
        System.out.println("Total money collected for all meals: " + totalForAllMeals);
    }
    
}
