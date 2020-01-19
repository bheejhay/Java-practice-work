/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.hub.model;

/**
 *
 * @author USER
 */
public class Directory {
    private String names, phoneNum;

    public Directory() {
    }

    public Directory(String names, String phoneNum) {
        this.names = names;
        this.phoneNum = phoneNum;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    
    
}
