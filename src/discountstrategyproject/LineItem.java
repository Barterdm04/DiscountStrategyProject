
package discountstrategyproject;

/**
 * This class represents a simulated line item for a receipt in a retail sales organization
 *
 * @author dbarter1
 * @version 1.00
 */

public class LineItem {
    private Product product;
    private int quantity;
    
    /**
     * The constructor method for a line item
     * 
     * @param product - unique identifier for the product object
     * @param quantity - unique identifier for the quantity
     */
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    /**
     * 
     * @return - returns the product id of the line item's product 
     */
    public final String getProdID(){
        return product.getProdID();
    }
    
    /**
     * 
     * @return -  returns the product description of the item's product 
     */
    public final String getProdDesc(){
        return product.getProdDesc();
    }
    
    /**
     * 
     * @return -  returns the product unit price of the item's product 
     */
    public final double getUnitPrice(){
        return product.getUnitPrice();
    }
    
    /**
     * 
     * @return - returns the subtotal of the line item
     */
    public final double getSubTotal(){
        double subtotal = quantity * product.getUnitPrice();
        subtotal -= (subtotal * product.getDiscount());
        return subtotal;
    }
    
    /**
     * 
     * @return returns the amount of money saved by discounts in the line item 
     */
    public final double getAmountSaved(){
        return (quantity * product.getUnitPrice() * product.getDiscount());
    }
    
    /**
     * 
     * @return - returns the quantity within the line item 
     */
    public final int getQuantity() {
        return quantity;
    }
}
