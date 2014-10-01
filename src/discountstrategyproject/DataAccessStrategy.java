/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**
 * An interface for various database types
 *
 * @author dbarter1
 * @version 1.00
 */
public interface DataAccessStrategy {
    public abstract Product findProduct(String productNo);
    public abstract Customer findCustomer(String custNo);
    public abstract Store findStore(String storeNo);
}
