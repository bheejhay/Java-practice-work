
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
public class Electionstatistics {

    String partyname1;
    String partyname2;
    String partyname3;
    int party1Noofvote;
    int party2Noofvote;
    int party3Noofvote;
    float totalvotes;
    float percentagevotes;

    Scanner input = new Scanner(System.in);

    public void display() {
        System.out.print("totalvotes= ");
        totalvotes = input.nextFloat();
        System.out.println();

        System.out.print("party name1= ");
        partyname1 = input.next();
        System.out.print("party1Noofvote= ");
        party1Noofvote = input.nextInt();
        percentagevotes = (party1Noofvote / totalvotes) * 100;
        System.out.println("party1 percentagevotes= " + percentagevotes);
        System.out.println();
        
        System.out.print("partyname2= ");
        partyname2 = input.next();
        System.out.print("party2Noofvote= ");
        party2Noofvote = input.nextInt();
        percentagevotes = (party2Noofvote / totalvotes) * 100;
        System.out.println("party2 percentage votes= " + percentagevotes);
        System.out.println();
        
        System.out.print("partyname3= ");
        partyname3 = input.next();
        System.out.print("party3Noofvote= ");
        party3Noofvote = input.nextInt();
        percentagevotes = (party3Noofvote / totalvotes) * 100;
        System.out.println("party3 percentage votes= " + percentagevotes);
        

    }
}
