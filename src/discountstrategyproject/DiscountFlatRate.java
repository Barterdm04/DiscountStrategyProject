/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 * This is a simulated flat rate discount type for a retail sales organization
 *
 * @author DB7
 * @version 1.00
 */
public class DiscountFlatRate implements DiscountStrategy{
    private double discount = .1;
    private int maxDiscount = 1;
    private int minDiscount = 0;
    
    /**
     * This is a default constructor for the discount flat rate 
     */
    public DiscountFlatRate() {
    }
    
    /**
     * This is a constructor method that accepts a value to bet set as the initial discount value
     * @param discount - identifier for the discount value being passed
     */
    public DiscountFlatRate(double discount) {
        this.discount = discount;
    }    
    
    /**
     * 
     * @return - returns the current value of the discount 
     */
    @Override
    public final double getDiscount(){
        return discount;
    }
    
    /**
     * Sets a new discount value for this discount
     * 
     * @param discount - the identifier for the discount value
     */
    public final void setDiscount(double discount){
        if(discount > maxDiscount|| discount < minDiscount){
            throw new IllegalArgumentException();
        }
        this.discount = discount;
    }
}
