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
public class Haiku extends poet{
   protected final int LINES3=3;

    public Haiku() {
    }

    public Haiku(String nameOfPoem, int NumOfLines) {
        super(nameOfPoem, NumOfLines);
    }

    public int getLINES3() {
        return LINES3;
    }
   
   
}
