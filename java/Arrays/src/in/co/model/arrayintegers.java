/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.model;

/**
 *
 * @author USER
 */
public class arrayintegers {
private int numbers;
protected int[] num = new int[8];

public void displaynum (){

}

    public arrayintegers(int numbers) {
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
    public arrayintegers() {
    }
}
