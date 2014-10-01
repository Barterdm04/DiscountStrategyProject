/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**This class represents a simulation of a Point of Sales Terminal in a retail sales organization
 * 
 *Note: JavaDoc documentation is incomplete!
 * 
 * @author Dylan Barter
 * @version 1.00
 */

public class POSRegister {
    private ReceiptStrategy receipt;
    
    public final void startNewSale(String customerNo, String store){
        receipt = new ReceiptConsole(customerNo, store);
    }
        
    public final void addItemToSale(String scannedItem, int quantity){
        receipt.addLineItem(scannedItem, quantity);
    }
    public final void finalizeSale(){
        receipt.outputReceipt();
    }
}
