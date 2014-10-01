package discountstrategyproject;

/**This class represents a simulation of a Customer in a retail sales organization
 *
 * @author dbarter1
 * @version 1.00
 */
public class Customer {
    String custNo;
    String fName;
    String lName;
    String address;
    String city;
    String state;
    String zip;
    String phone;

    /**
     * The constructor method for a Customer
     * @param custNo - Unique identifier for the customer number
     * @param fName - identifier for the customer's first name
     * @param lName - identifier for the customer's last name
     * @param address - identifier for the customer's street address
     * @param city - identifier for the customer's city
     * @param state - identifier for the customer's state
     * @param zip - identifier for the customer's zip code
     * @param phone - identifier for the customer's phone number
     */
    public Customer(String custNo, String fName, String lName, String address, String city, String state, String zip, String phone) {
        this.custNo = custNo;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }
    
    /**
     * 
     * @return - return the current customer number for the customer 
     */
    public final String getCustNo() {
        return custNo;
    }
    
    /**Sets the customer's customer number
     * 
     * @param custNo - identifier for the customer number
     */
    public final void setCustNo(String custNo) {
        if(custNo.length() != 5){
            throw new IllegalArgumentException();
        }
        this.custNo = custNo;
    }
    
    /**
     * 
     * @return - return the current first name listed for the customer 
     */
    public final String getFName() {
        return fName;
    }
    
    /**Sets the customer's first name
     * 
     * @param fname - identifier for first name
     */
    public final void setFName(String fname) {
        if(fname == null || fname.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.fName = fname;
    }
    
    /**
     * 
     * @return - returns the current last name for the customer 
     */
    public final String getLName() {
        return lName;
    }
    
    /**
     * Sets the customer's last name 
     * @param lname - identifier for last name
     */
    public final void setLName(String lname) {
        if(lname == null || lname.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.lName = lname;
    }
    
    /**
     * 
     * @return -  returns the current address line listed for the customer 
     */
    public final String getAddress() {
        return address;
    }
    
    /**
     * Sets the customer's address line
     * @param address - identifier for address line
     */
    public void setAddress(String address) {
        if(address == null || address.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.address = address;
    }
    
    /**
     * 
     * @return- returns the current city listed for the customer 
     */
    public String getCity() {
        return city;
    }
    
    /**
     * Sets the customer's city
     * @param city - identifier for the customer's city
     */
    public void setCity(String city) {
        if(city == null || city.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.city = city;
    }
    
    /**
     * 
     * @return - returns the current state abbreviation listed for the customer 
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the customers state abbreviation
     * @param state - identifier for customer's state
     */
    public void setState(String state) {
        if(state == null || state.isEmpty() || state.length() > 2){
            throw new IllegalArgumentException();
        }
        this.state = state;
    }
    
    /**
     * 
     * @return - returns the current zip code listed for the customer 
     */
    public String getZip() {
        return zip;
    }
    
    /**
     * Sets the customer's zip code
     * @param zip - identifier for the customer's zip code
     */
    public void setZip(String zip) {
        if(zip == null || zip.isEmpty() || zip.length() != 5){
            throw new IllegalArgumentException();
        }
        this.zip = zip;
    }
    
    /**
     * 
     * @return - returns the current phone number listed for the customer 
     */
    public String getPhone() {
        return phone;
    }
    
    /**
     * Sets the customer's phone number
     * @param phone - identifier for customer phone number
     */
    public void setPhone(String phone) {
        if(phone == null || phone.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.phone = phone;
    }
    
    
}
