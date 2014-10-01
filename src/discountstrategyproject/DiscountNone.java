/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**A simulated discount value of zero for a retail sales organization
 *
 * @author DB7
 * @version 1.00
 */
public class DiscountNone implements DiscountStrategy{
    private static final double NO_DISCOUNT = 0.0;
    
    /**
     * 
     * @return - returns the value of the discount strategy type
     */
    @Override
    public final double getDiscount(){
        return NO_DISCOUNT;
    }

}
