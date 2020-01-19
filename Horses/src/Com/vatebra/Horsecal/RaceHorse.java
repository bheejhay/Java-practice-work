/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.Horsecal;

/**
 *
 * @author USER
 */
public class RaceHorse extends Horse{
    private int numOfRace ;

    public RaceHorse() {
        
    }

    public RaceHorse(int numOfRace, String colour, String name, int years) {
        super(colour, name, years);
        this.numOfRace = numOfRace;
    }

    public int getNumOfRace() {
        return numOfRace;
    }

    public void setNumOfRace(int numOfRace) {
        this.numOfRace = numOfRace;
    }

   

    

     
}
