/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class DiscountQuatity implements Serializable {
    @Id
    int quantityForDiscount = 3;
    double discount = 0.2; //20% on all if quantity is 3 or more

  
    public double calcDiscount(double priceItem, int quantity) {
        return quantity >= quantityForDiscount ? priceItem * quantity * discount : 0;
    }

}
