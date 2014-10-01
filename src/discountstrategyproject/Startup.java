/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**
 * This is the startup class to initialize the discount strategy project
 *
 * @author dbarter1
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        POSRegister register1 = new POSRegister();
        String customerNo = "01104";
        String storeNo = "303";
        
        register1.startNewSale(customerNo, storeNo);
        register1.addItemToSale("0100", 3);
        register1.addItemToSale("0101", 1);
        register1.addItemToSale("0102", 6);
        register1.finalizeSale();
    } 
    
}
