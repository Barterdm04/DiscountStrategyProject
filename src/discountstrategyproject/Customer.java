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
    String name;
    String custNo;

    public Customer(String name, String custNo) {
        this.name = name;
        this.custNo = custNo;
    }
    public Customer(String name) {
        this.name = name;
        custNo = " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
    
}
