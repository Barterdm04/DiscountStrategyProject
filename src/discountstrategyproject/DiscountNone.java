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
    private static final double NO_DISCOUNT = 0.0;
    @Override
    public final double getDiscount(){
        return NO_DISCOUNT;
    }
    @Override
    public final void setDiscount(double discount){
        
    }
}
