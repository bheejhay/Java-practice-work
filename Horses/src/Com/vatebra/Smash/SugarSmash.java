/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.Smash;

/**
 *
 * @author USER
 */
public class SugarSmash {
    private String idNum, name;
    protected int Hscore;
    int [] score = new int[100] ;
    int [] gameLevel = new int[10];

    public SugarSmash() {
    }

    public SugarSmash(String idNum, String name) {
        this.idNum = idNum;
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getscore() {
        return score;
    }

    public void setscore(int[] Hscore) {
        this.score = score;
    }

    public int getHscore() {
        return Hscore;
    }
    
    
    
    
}
