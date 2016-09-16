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
public class DiscountFixed implements Serializable {
    @Id
    double discount = 0.1; //10% on all

  
    public double calcDiscount(double priceItem, int quantity) {
        return priceItem * discount * quantity;
 }
}
