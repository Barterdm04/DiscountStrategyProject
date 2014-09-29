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
public class LineItem {
    private Product product;
    private int quantity;
    
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public LineItem(){
        
    }
    public String getProdID(){
        return product.getProdID();
    }
    
    public String getProdDesc(){
        return product.getProdDesc();
    }
    public double getUnitPrice(){
        return product.getUnitPrice();
    }
    
    public double getSubTotal(){
        double subtotal = quantity * product.getUnitPrice();
        subtotal -= (subtotal * product.getDiscount());
        return subtotal;
    }
    
    public double getAmountSaved(){
        return (quantity * product.getUnitPrice() * product.getDiscount());
    }
   
    public int getQuantity() {
        return quantity;
    }


    
    
    
    
}
