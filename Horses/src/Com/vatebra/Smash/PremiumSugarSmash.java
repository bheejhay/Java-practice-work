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
public class PremiumSugarSmash extends SugarSmash {
    protected final double lev = 2.99;

    public PremiumSugarSmash() {
    }

    public PremiumSugarSmash(String idNum, String name) {
        super(idNum, name);
    }

    public double getLev() {
        return lev;
    }
    
    
    
}
