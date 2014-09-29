
package discountstrategyproject;

/**
 *
 * @author dbarter1
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

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return DiscountType.getDiscount();
    }

    public DiscountStrategy getDiscountType(){
        return DiscountType;
    }
    public void setDiscountType(DiscountStrategy DiscountType) {
        this.DiscountType = DiscountType;
    }
    
}
