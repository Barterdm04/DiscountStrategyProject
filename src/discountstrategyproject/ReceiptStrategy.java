/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**
 * This interface is a structure for simulated receipt outputs in a retail sales organization
 *
 * @author dbarter1
 * @version 1.00
 */
public interface ReceiptStrategy {
    public abstract void addLineItem(String itemNum, int quantity);
    public abstract void outputReceipt();
    
}
