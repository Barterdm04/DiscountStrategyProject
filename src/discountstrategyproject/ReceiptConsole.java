/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

import java.text.NumberFormat;

/**
 * This class represents a simulation of a receipt object for a retail sales organization
 * 
 *
 * 
 * @author Dylan Barter
 * @version 1.00
 */
public class ReceiptConsole implements ReceiptStrategy{
    private double salesTax = .05;
    
    private FakeDatabase database = new FakeDatabase();
    private LineItem[] lineItems = new LineItem[0];
    
    private Customer customer;
    private Store store;
    private String thankYou = "Thank you for your business, please come again!";
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    /**
     * Constructor method for a receipt that prints to the console
     * 
     * @param customerNo - identifier for the customer id number for the sale
     * @param storeNo  - identifier for the store id number for the sale
     */
    public ReceiptConsole(String customerNo, String storeNo) {  
        this.customer = database.findCustomer(customerNo);
        this.store = database.findStore(storeNo);
    }
    
    /**
     * 
     * @return - returns the customer associated with the receipt 
     */
    public Customer getCustomer() {
        return customer;
    }
    
    /**
     * This method sets a new customer to the receipt 
     * 
     * @param customer - identifier for the customer object
     */
    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    /**
     * 
     * @return - returns the store associated with the receipt 
     */
    public final Store getStore() {
        return store;
    }
    
    /**
     * This method sets a new store to the receipt
     * 
     * @param store - identifier for the store object
     */
    public final void setStore(Store store) {
        this.store = store;
    }
    
    /**
     * 
     * @return - returns the array of line items currently on the receipt 
     */
    public final LineItem[] getLineItems() {
        return lineItems;
    }
    
    /**
     * This method adds a line item to the receipt
     * 
     * @param itemNum - identifier for the product id number
     * @param quantity - identifier for the quantity for this product
     */
    @Override
    public final void addLineItem(String itemNum, int quantity) {
        LineItem lineItem = new LineItem(database.findProduct(itemNum), quantity);
        addToArray(lineItem);
    }
    
    /**
     * 
     * @return -  returns the current Thank You message assigned to the receipt 
     */
    public final String getThankYou() {
        return thankYou;
    }
    
    /**
     * This method will set a new thank you message for the receipt
     * 
     * @param thankYou - identifier for the thank you message
     */
    public final void setThankYou(String thankYou) {
        this.thankYou = thankYou;
    }
    
    /**
     * This method allows you to add line items to the line items array
     * 
     * @param item - identifier for the line item being added
     */
    private final void addToArray(final LineItem item) {             
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length); 
        tempItems[lineItems.length] = item;        
        lineItems = tempItems;    
    }
    
    /**
     * This method prints the receipt to the console
     */
    @Override
    public final void outputReceipt(){
        double runningSubtotal = 0;
        double runningDiscount = 0;
        double total = 0;
        double taxAmt = 0;
        System.out.println("Store No: " + store.getStoreNo());
        System.out.println("Store Zip: " + store.getZipCode());
        System.out.println("Customer Name: " + customer.getLName() + ", " + customer.getFName());
        System.out.println("Customer No: " + customer.getCustNo());
        System.out.println("------------------------");
        System.out.println("PROD# \t DESCRIPTION \t\t  UNIT PRICE \t QTY \t SUBTOTAL");
        System.out.println("-----------------------------------------------------------------------");
        for (LineItem lines: lineItems){
            System.out.println(lines.getProdID() + " \t " + lines.getProdDesc() + " \t  " + nf.format(lines.getUnitPrice()) + " \t " + lines.getQuantity() + "\t " + nf.format(lines.getSubTotal()));
            runningSubtotal += lines.getSubTotal();
            runningDiscount += lines.getAmountSaved();
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("SUBTOTAL: \t\t\t\t\t\t " + nf.format(runningSubtotal));
        System.out.println("You Saved: \t\t\t\t\t\t " + nf.format(runningDiscount));
        System.out.println("-----------------------------------------------------------------------");
        taxAmt = salesTax * runningSubtotal;
        total = runningSubtotal + taxAmt;
        System.out.println("SALES TAX (5%): \t\t\t\t\t " + nf.format(taxAmt));
        System.out.println("TOTAL: \t\t\t\t\t\t\t " + nf.format(total));
        System.out.println(" ");
        System.out.println(thankYou);
    }

}
