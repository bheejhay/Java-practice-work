/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candleSticks;

/**
 *
 * @author USER
 */
public class ScentedCandle extends Candle {
    private String scent;
    final double NPRICE = 3;
    double nprice ;

    public ScentedCandle() {
    }

    public ScentedCandle(String scent, String colour, double height) {
        super(colour, height);
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    @Override
    public void calcheight(double height) {
        nprice = NPRICE * height;
        System.out.println("The total cost of the candles is " +nprice);
    }

}

  
            
