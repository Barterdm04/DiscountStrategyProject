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

public class FakeDatabase implements DataAccessStrategy{
    private DiscountStrategy NoDisc = new DiscountNone();
    private DiscountStrategy FlatDisc = new DiscountFlatRate();
    
    private Product[] products = {
        new Product("0100", "Pair of Levi's Jeans", 45.99, NoDisc),
        new Product("0101", "Pair of Adidas Socks", 5.99, FlatDisc),
        new Product("0102", "Nike T-Shirt", 19.99, FlatDisc)    
    };
    
    private Customer[] customers = {
        new Customer("01104", "Bill", "Franklin", "123 Fake St.", "Milwaukee", "WI", "53020", "414-555-1122"),
        new Customer("02204", "Nancy", "Williams", "33 Sell St.", "Minneapolis", "MN", "33022", "303-333-1111")
    };
    
    private Store[] stores = {
        new Store("233", "53051"),
        new Store("234", "53022"),
        new Store("303", "45902")
    };
    
    /**Finds out if the product number given matches a product number within the database
     * 
     * @param prodID - identifier for the product number
     * @return - returns a product object
     */
    
    public final Product findProduct(String prodID){
        Product productFound = null;
        for(int i = 0; i < products.length; i++){
            if (prodID.equals(products[i].getProdID())){
                productFound = products[i];
                break;
            }
        }
        if(productFound == null) {
            throw new IllegalArgumentException();
        }
        return productFound;
    }
    
    /**Finds out if the store number given matches a store number within the database
     * 
     * @param storeNo - identifier for the store number
     * @return - returns a store object
     */
    public final Store findStore(String storeNo){
        Store storeFound = null;
        for(int i = 0; i < stores.length; i++){
            if (storeNo.equals(stores[i].getStoreNo())){
                storeFound = stores[i];
                break;
            }
        }
        if(storeFound == null) {
            throw new IllegalArgumentException();
        }
        return storeFound;
    }
    
    /**Finds out if the customer number given matches a customer number within the database
     * 
     * @param custNo - identifier for the customer number
     * @return - returns a customer object
     */
    public final Customer findCustomer(String custNo){
        Customer custFound = null;
        for(int i = 0; i < customers.length; i++){
            if (custNo.equals(customers[i].getCustNo())){
                custFound = customers[i];
                break;
            }
        }
        if(custFound == null) {
            throw new IllegalArgumentException();
        }
        return custFound;
    }
    
    
}
