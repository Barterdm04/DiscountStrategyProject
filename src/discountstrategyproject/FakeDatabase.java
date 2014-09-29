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
public class FakeDatabase {
    private DiscountStrategy NoDisc = new DiscountNone();
    private DiscountStrategy FlatDisc = new DiscountFlatRate();
    private Product product1 = new Product("0100", "Pair of Levi's Jeans", 45.99, NoDisc);
    private Product product2 = new Product("0101", "Pair of Adidas Socks", 5.99, FlatDisc);
    private Product product3 = new Product("0102", "Nike T-Shirt", 19.99, FlatDisc);
    private Product[] products = {product1, product2, product3};
    
    public Product findProduct(String prodID){
        Product productFound = new Product();
        for(int i = 0; i < products.length; i++){
            if(prodID.equals(products[i].getProdID())){
                productFound = products[i];
            } else {
                throw new IllegalArgumentException(
                    "error: product number not found in database");
            }
        }
        return product1;
    }
    
    
    
}
