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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new reciept, look up customer, look up store, look up product, create new lineitem, set the product and quantity on lineitem, save to reciept
        POSRegister register1 = new POSRegister();
        
        Store store = new Store("7366", "53033");
        Customer customer = new Customer("Bill Gates", "2342342");
        
        register1.startNewSale(customer, store);
        register1.addItemToSale("0100", 3);
//        register1.addItemToSale("0101", 1);
//        register1.addItemToSale("0102", 6);
        register1.finalizeSale();
    } 
    
}