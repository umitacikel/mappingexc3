/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
    
    @Id
    String Customer;
    int Price;
    int ID;
    @OneToOne
    private DiscountType dt;
    
    
    
     public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    @Override
    public String toString() {
        return "DiscountType{" + "Customer=" + Customer + ", Price=" + Price + ", ID=" + ID + '}';
    }
   
}
