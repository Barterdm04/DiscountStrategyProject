/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**This class represents a simulation of a product and customer database in a retail sales organization
 * 
 *Note: JavaDoc documentation is incomplete!
 * 
 * @author Dylan Barter
 * @version 1.00
 */

public class FakeProductDatabase{
    private DiscountStrategy NoDisc = new DiscountNone();
    private DiscountStrategy FlatDisc = new DiscountFlatRate();
    
    private Product[] products = {
        new Product("0100", "Pair of Levi's Jeans", 45.99, NoDisc),
        new Product("0101", "Pair of Adidas Socks", 5.99, FlatDisc),
        new Product("0102", "Nike T-Shirt", 19.99, FlatDisc)    
    };
    
    public final Product findProduct(String prodID){
        Product productFound = new Product();
        for(int i = 0; i < products.length; i++){
            if (prodID.equals(products[i].getProdID())){
                productFound = products[i];
            } else {
                throw new IllegalArgumentException(
                    "error: product number not found in database"); 
            }
        }
        return productFound;
    }
    
    
    
}
