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
    public abstract void addLineItem(String itemNum, int quantity);
    public abstract void outputReceipt();
    
}
