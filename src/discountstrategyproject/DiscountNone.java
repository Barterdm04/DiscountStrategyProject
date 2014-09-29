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
public class DiscountNone implements DiscountStrategy{
    private double discount = 0.0;
    @Override
    public double getDiscount(){
        return discount;
    }
    @Override
    public void setDiscount(double discount){
        this.discount = discount;
    }
}
