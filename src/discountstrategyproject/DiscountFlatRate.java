/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author DB7
 */
public class DiscountFlatRate implements DiscountStrategy{
    private double discount = .1;
    
    @Override
    public final double getDiscount(){
        return discount;
    }
    @Override
    public final void setDiscount(double discount){
        if(discount > 1 || discount < 0){
            throw new IllegalArgumentException();
        }
        this.discount = discount;
    }
}
