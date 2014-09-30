/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

import java.text.NumberFormat;

/**
 *
 * @author dbarter1
 */
public class LineItem {
    private Product product;
    private int quantity;
    
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public LineItem(){  
    }
    
    public final String getProdID(){
        return product.getProdID();
    }
    
    public final String getProdDesc(){
        return product.getProdDesc();
    }
    public final double getUnitPrice(){
        return product.getUnitPrice();
    }
    
    public final double getSubTotal(){
        double subtotal = quantity * product.getUnitPrice();
        subtotal -= (subtotal * product.getDiscount());
        return subtotal;
    }
    
    public final double getAmountSaved(){
        return (quantity * product.getUnitPrice() * product.getDiscount());
    }
   
    public final int getQuantity() {
        return quantity;
    }


    
    
    
    
}
