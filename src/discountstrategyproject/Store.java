/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**This class represents a simulation of a store in a retail sales organization
 * 
 *Note: JavaDoc documentation is incomplete!
 * 
 * @author Dylan Barter
 * @version 1.00
 */
public class Store {
    private String storeNo;
    private String zipCode;
    
    /**Constructor method for a store 
     * 
     * @param storeNo - identifier for the store's id number
     * @param zipCode - identifier for the store zip code
     */
    public Store(String storeNo, String zipCode) {
        this.storeNo = storeNo;
        this.zipCode = zipCode;
    }
    
    /**
     * 
     * @return - returns the store number associated with the store 
     */
    public final String getStoreNo() {
        return storeNo;
    }
    
    /**This method sets a new store number for a store
     * 
     * @param storeNo - identifier for the store's id number
     */
    public final void setStoreNo(String storeNo) {
        if(storeNo.length() != 5){
            throw new IllegalArgumentException();
        }
        this.storeNo = storeNo;
    }
    
    /**
     * 
     * @return -  returns the zip code associated with the store 
     */
    public final String getZipCode() {
        return zipCode;
    }
    
    /**This method sets a new zip code to the store
     * 
     * @param zipCode - identifier for the store zip code
     */
    public final void setZipCode(String zipCode) {
        if(zipCode.length() != 5){
            throw new IllegalArgumentException();
        }
        this.zipCode = zipCode;
    }
}
