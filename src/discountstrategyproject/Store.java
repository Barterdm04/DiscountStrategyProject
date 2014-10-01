/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategyproject;

/**This class represents a simulation of a physical store in a retail sales organization
 * 
 *Note: JavaDoc documentation is incomplete!
 * 
 * @author Dylan Barter
 * @version 1.00
 */
public class Store {
    private String storeNo;
    private String zipCode;

    public Store(String storeNo, String zipCode) {
        this.storeNo = storeNo;
        this.zipCode = zipCode;
    }

    public final String getStoreNo() {
        return storeNo;
    }

    public final void setStoreNo(String storeNo) {
        if(storeNo.length() != 5){
            throw new IllegalArgumentException();
        }
        this.storeNo = storeNo;
    }

    public final String getZipCode() {
        return zipCode;
    }

    public final void setZipCode(String zipCode) {
        if(zipCode.length() != 5){
            throw new IllegalArgumentException();
        }
        this.zipCode = zipCode;
    }
}
