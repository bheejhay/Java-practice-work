/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metal.alloyd.model;

/**
 *
 * @author USER
 */
public class Commonkey {
    int alcode;

    public Commonkey() {
    }

    public Commonkey(int alcode) {
        this.alcode = alcode;
    }

    public int getAlcode() {
        return alcode;
    }

    public void setAlcode(int alcode) {
        this.alcode = alcode;
    }

    @Override
    public String toString() {
        return "Commonkey{" + "alcode=" + alcode + '}';
    }
    
    
    
}
