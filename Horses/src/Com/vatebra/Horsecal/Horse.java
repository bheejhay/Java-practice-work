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
public class Horse {
    private String colour;
    private String name;
    private int years;

    public Horse() {
    }

    public Horse(String colour, String name, int years) {
        this.colour = colour;
        this.name = name;
        this.years = years;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    
    

}
