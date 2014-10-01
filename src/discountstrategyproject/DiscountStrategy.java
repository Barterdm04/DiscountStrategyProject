/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**An interface for types of discounts for a simulated retail sales organization
 *
 * @author dbarter1
 * @version 1.00
 */
public interface DiscountStrategy {
    /**
     * 
     * @return - returns a double when you implement this method 
     */
    public abstract double getDiscount();
}
