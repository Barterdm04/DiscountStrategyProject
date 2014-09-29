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
public class POSRegister {
    private ReceiptStrategy receipt;
    private FakeDatabase database = new FakeDatabase();
    private LineItem lineItem;
    
    public void startNewSale(Customer customer, Store store){
        receipt = new RecieptConsole();
        receipt.setCustomer(customer);
        receipt.setStore(store);
    }
    
    public void startNewSale(Store store){
        receipt = new RecieptConsole();
        receipt.setStore(store);
    }
    
    public void addItemToSale(String scannedItem, int quantity){
        lineItem = new LineItem(database.findProduct(scannedItem), quantity);
        receipt.addLineItem(lineItem);
    }
    public void finalizeSale(){
        receipt.outputReceipt();
    }
}
