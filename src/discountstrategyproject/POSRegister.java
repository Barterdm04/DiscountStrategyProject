/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**
 * This class represents a simulation of a Point of Sales Terminal in a retail sales organization
 * 
 *Note: JavaDoc documentation is incomplete!
 * 
 * @author Dylan Barter
 * @version 1.00
 */

public class POSRegister {
    private ReceiptStrategy receipt;
    
    /** 
     * This method initializes the sales receipt for a new sale
     * 
     * @param customerNo - identifier for the customer number of the customer
     * @param storeNo - identifier for the store number of the store
     */
    public final void startNewSale(String customerNo, String storeNo){
        receipt = new ReceiptConsole(customerNo, storeNo);
    }
    
    /**
     * This method adds an item to the sale using the item number and the quantity
     * 
     * @param scannedItem - identifier for the product ID code
     * @param quantity - identifier for the quantity of the product
     */
    public final void addItemToSale(String scannedItem, int quantity){
        receipt.addLineItem(scannedItem, quantity);
    }
    
    /**
     * This method will output the receipt when the sale has been signaled as finalized
     * 
     */
    
    public final void finalizeSale(){
        receipt.outputReceipt();
    }
}
