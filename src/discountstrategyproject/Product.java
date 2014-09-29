
package discountstrategyproject;

/**This class represents a simulation of a product in a retail sales organization
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
    private DiscountStrategy DiscountType;
    
    public Product(){ 
    }
    
    public Product(String prodID, String prodDesc, double unitPrice, DiscountStrategy Discount){
        this.prodID = prodID;
        this.prodDesc = prodDesc;
        this.unitPrice = unitPrice;
        this.DiscountType = Discount;
    }

    public final String getProdID() {
        return prodID;
    }

    /**
     * Sets the id. This method is not yet validated
     * @param prodID -the unique identifier for this product
     * @throws IllegalArgumentException if prodID is null or empty
     */
    public final void setProdID(String prodID) {
        if(prodID == null || prodID.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.prodID = prodID;
    }

    public final String getProdDesc() {
        return prodDesc;
    }

    public final void setProdDesc(String prodDesc) {
        if(prodDesc == null || prodDesc.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.prodDesc = prodDesc;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        if(unitPrice < 0) {
            throw new IllegalArgumentException();
        }
        this.unitPrice = unitPrice;
    }

    public final double getDiscount() {
        return DiscountType.getDiscount();
    }

    public final DiscountStrategy getDiscountType(){
        return DiscountType;
    }
    
    public final void setDiscountType(DiscountStrategy DiscountType) {
        this.DiscountType = DiscountType;
    }
    
}
