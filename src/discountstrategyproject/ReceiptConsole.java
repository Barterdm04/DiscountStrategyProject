/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

import java.text.NumberFormat;

/**This class represents a simulation of a receipt object for a retail sales organization
 * 
 *Note: JavaDoc documentation is incomplete!
 * 
 * @author Dylan Barter
 * @version 1.00
 */
public class ReceiptConsole implements ReceiptStrategy{
    private double salesTax = .05;
    private Customer customer;
    private Store store;
    private LineItem[] lineItems = new LineItem[0];
    private String thankYou = "Thank you for your business, please come again!";
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public ReceiptConsole(String customerNo, Store store) {
        this.customer = findCustomer(customerNo);
        this.store = findStore(store);
    }
    

    public Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final Store getStore() {
        return store;
    }

    public final void setStore(Store store) {
        this.store = store;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    @Override
    public final void addLineItem(LineItem lineItem) {
        addToArray(lineItem);
    }

    public final String getThankYou() {
        return thankYou;
    }

    public final void setThankYou(String thankYou) {
        this.thankYou = thankYou;
    }
    
    private final void addToArray(final LineItem item) {        
        // needs validation        
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length); 
        tempItems[lineItems.length] = item;        
        lineItems = tempItems;    
    }
    
    @Override
    public final void outputReceipt(){
        double runningSubtotal = 0;
        double runningDiscount = 0;
        double total = 0;
        double taxAmt = 0;
        System.out.println("Store No: " + store.getStoreNo());
        System.out.println("Store Zip: " + store.getZipCode());
        System.out.println("Customer Name: " + customer.getName());
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

    private Customer findCustomer(String customerNo) {
        
    }

    private Store findStore(Store store) {
       
    }
}
