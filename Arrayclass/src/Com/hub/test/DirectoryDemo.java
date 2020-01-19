/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.hub.test;

import Com.hub.model.DirectoryDao;
import Com.hub.model.DirectoryDaoimpl;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DirectoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        displaycont();

    }
    

    public static void displaycont() {
        int option;

    Scanner sc = new Scanner(System.in);
    
        DirectoryDao dir = new DirectoryDao();
        DirectoryDaoimpl di = new DirectoryDaoimpl();
        
        System.out.println("Choose from the following options");
        System.out.println("1. To add Names and Phone Number");
        System.out.println("2. To display details");

        System.out.println("enter option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                dir.displaydir();

            case 2:
                di.displaydir2();

        }
    }

}
