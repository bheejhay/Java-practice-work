/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.poem;

/**
 *
 * @author USER
 */
public class poet {
    protected String nameOfPoem;
    protected int NumOfLines;

    public poet() {
    }

    public poet(String nameOfPoem, int NumOfLines) {
        this.nameOfPoem = nameOfPoem;
        this.NumOfLines = NumOfLines;
    }

    public String getNameOfPoem() {
        return nameOfPoem;
    }

    public int getNumOfLines() {
        return NumOfLines;
    }
    
    
    
}
