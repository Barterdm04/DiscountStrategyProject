package discountstrategyproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbarter1
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

    public final String getCustNo() {
        return custNo;
    }

    public final void setCustNo(String custNo) {
        if(custNo.length() != 5){
            throw new IllegalArgumentException();
        }
        this.custNo = custNo;
    }

    public final String getFName() {
        return fName;
    }

    public final void setFName(String fname) {
        if(fname == null || fname.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.fName = fname;
    }

    public final String getLName() {
        return lName;
    }

    public final void setLName(String lname) {
        if(lname == null || lname.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.lName = lname;
    }

    public final String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address == null || address.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null || city.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if(state == null || state.isEmpty() || state.length() > 2){
            throw new IllegalArgumentException();
        }
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        if(zip == null || zip.isEmpty() || zip.length() != 5){
            throw new IllegalArgumentException();
        }
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone == null || phone.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.phone = phone;
    }
    
    
}
