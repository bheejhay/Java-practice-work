/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.vatebra.Teeshirt;

/**
 *
 * @author USER
 */
public class CustomTeeshirt extends Teeshirt {

    private String slogan;
    public final double SIZE1 = 22.99;
    public final double SIZE2 = 19.99;

    public CustomTeeshirt() {
    }

    public CustomTeeshirt(String slogan, int orderNum, String colour, double size, double price) {
        super(orderNum, colour, size, price);
        this.slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Double getSIZE1() {
        return SIZE1;
    }

    public Double getSIZE2() {
        return SIZE2;
    }

    @Override
    public double calcprice(double size) {
        if(size == SIZE1){
            return getOrderNum() * getSIZE1();
        }else{
            return getOrderNum() * getSIZE2();
        }
      
           
    }

}
