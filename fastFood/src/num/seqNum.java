/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num;

/**
 *
 * @author USER
 */
public class seqNum {

    private String Sname;
    private String supCode;
    private String projnum;
    private String pName;

    public seqNum() {
    }

    public seqNum(String Sname, String supCode, String projnum, String pName) {
        this.Sname = Sname;
        this.supCode = supCode;
        this.projnum = projnum;
        this.pName = pName;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public String getProjnum() {
        return projnum;
    }

    public void setProjnum(String projnum) {
        this.projnum = projnum;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    
}
