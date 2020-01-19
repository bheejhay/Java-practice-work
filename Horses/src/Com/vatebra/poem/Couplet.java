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
public class Couplet extends poet {
    protected  final int lines = 2;

    public Couplet() {
    }

    public Couplet(String nameOfPoem, int NumOfLines) {
        super(nameOfPoem, NumOfLines);
    }

    public int getLines() {
        return lines;
    }
    
    
    
}
