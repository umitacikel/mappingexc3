/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DiscountType {

    @OneToMany(mappedBy = "dt")
    private List<Customer> customers;

    @Id
    String discount;
    String discountPrItem;
    
    public static void main(String[] args) {
        DiscountFixed df = new DiscountFixed();
        DiscountQuatity dq = new DiscountQuatity();
        System.out.println(df.calcDiscount(20, 2));
        System.out.println(dq.calcDiscount(333, 666));
    }
}
