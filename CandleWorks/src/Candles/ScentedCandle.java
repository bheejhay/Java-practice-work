/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candles;

/**
 *
 * @author USER
 */
public class ScentedCandle extends candleModel {
    private String scent;
    final double nPrice = 3;

    public ScentedCandle() {
    }

    public ScentedCandle(String scent) {
        this.scent = scent;
    }

    public ScentedCandle(String scent, String color, double height) {
        super(color, height);
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

}
