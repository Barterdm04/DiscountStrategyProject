
package discountstrategyproject;

/**
 * This class represents a simulation of a product in a retail sales organization
 * 
 *Note: JavaDoc documentation is incomplete!
 * 
 * @author Dylan Barter
 * @version 1.00
 */
public class Product {
    private String prodID;
    private String prodDesc;
    private double unitPrice;
    private DiscountStrategy discountType;
        
    /**
     * Constructor method for a Product
     * 
     * @param prodID - unique identifier for the product ID number
     * @param prodDesc - identifier for the description of the product
     * @param unitPrice - identifier for the unit price of the product
     * @param discount - identifier for the type of discount specified for the product
     */
    public Product(String prodID, String prodDesc, double unitPrice, DiscountStrategy discount){
        this.prodID = prodID;
        this.prodDesc = prodDesc;
        this.unitPrice = unitPrice;
        this.discountType = discount;
    }
    
    /**
     * 
     * @return - returns the current product ID number for this product 
     */
    public final String getProdID() {
        return prodID;
    }

    /**
     * Sets the id.
     * @param prodID -the unique identifier for this product
     * @throws IllegalArgumentException if prodID is null or empty
     */
    public final void setProdID(String prodID) {
        if(prodID == null || prodID.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.prodID = prodID;
    }

    /**
     * 
     * @return - Retrieves the product description for this product 
     */
    public final String getProdDesc() {
        return prodDesc;
    }
    
    /**
     * Sets the product description for this product
     * @param prodDesc - the unique identifier for this product description
     */
    public final void setProdDesc(String prodDesc) {
        if(prodDesc == null || prodDesc.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.prodDesc = prodDesc;
    }
    
    /**
     * 
     * @return - returns the current unit price of this product 
     */
    public final double getUnitPrice() {
        return unitPrice;
    }
    /**
     * Sets a new unit price for the specified product
     * 
     * @param unitPrice - the unique identifier for a unit price
     */
    public final void setUnitPrice(double unitPrice) {
        if(unitPrice < 0) {
            throw new IllegalArgumentException();
        }
        this.unitPrice = unitPrice;
    }
    
    /**
     * 
     * @return - returns the current discount in double format 
     */
    public final double getDiscount() {
        return discountType.getDiscount();
    }
    
    /**
     * 
     * @return -returns the current discount strategy type for this product 
     */
    public final DiscountStrategy getDiscountType(){
        return discountType;
    }
    
    /**
     * Sets a new discountStrategy type for the product
     * @param discountType - Unique identifier for the type of discount strategy
     */
    public final void setDiscountType(DiscountStrategy discountType) {
        this.discountType = discountType;
    }
    
}
