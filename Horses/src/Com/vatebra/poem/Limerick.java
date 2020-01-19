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
public class Limerick extends poet {
    protected final int lines2 = 5 ;

    public Limerick() {
    }

    public Limerick(String nameOfPoem, int NumOfLines) {
        super(nameOfPoem, NumOfLines);
    }

    public int getLines2() {
        return lines2;
    }
    
    
}
