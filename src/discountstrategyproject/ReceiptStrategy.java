/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**
 *
 * @author dbarter1
 */
public interface ReceiptStrategy {
    public abstract void addLineItem(LineItem lineItem);
    public abstract void outputReceipt();
    public abstract Customer getCustomer();
    public abstract Store getStore();
    public abstract void setCustomer(Customer customer);
    public abstract void setStore(Store store);
}
