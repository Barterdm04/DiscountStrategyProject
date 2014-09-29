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
    private FakeDatabase database = new FakeDatabase();
    private LineItem lineItem;
    
    public final void startNewSale(Customer customer, Store store){
        receipt = new ReceiptConsole();
        receipt.setCustomer(customer);
        receipt.setStore(store);
    }
    
    public final void startNewSale(Store store){
        receipt = new ReceiptConsole();
        receipt.setStore(store);
    }
    
    public final void addItemToSale(String scannedItem, int quantity){
        lineItem = new LineItem(database.findProduct(scannedItem), quantity);
        receipt.addLineItem(lineItem);
    }
    public final void finalizeSale(){
        receipt.outputReceipt();
    }
}
