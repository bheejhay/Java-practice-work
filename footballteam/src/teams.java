
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
public class teams {

    int numberofStudents;
    int numberofteams;
    int sizeOftheteams;
    int leftOvers;
    Scanner input = new Scanner(System.in);

    public void display() {
        System.out.println("****FOOTBALL TEAM SELECTION****");
        System.out.print("number of students= ");
        numberofStudents = input.nextInt();

        System.out.print("size of the teams= ");
        sizeOftheteams = input.nextInt();

        numberofteams = numberofStudents / sizeOftheteams;
        System.out.println("number of teams= " + numberofteams);

        leftOvers = numberofStudents - (sizeOftheteams * numberofteams);
        System.out.println("left overs= " + leftOvers);

    }

}
