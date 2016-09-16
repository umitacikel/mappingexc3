/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Adress {

    @OneToOne(mappedBy = "address")
    private person person;

    @ManyToMany(mappedBy = "adresses")
    private List<person> persons;

//    @OneToOne(mappedBy = "adr")
//    private person person;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    String Street;
    String city;
    
    
    
    @Override
    public String toString() {
        return "Adress{" + "id=" + id + ", Street=" + Street + ", city=" + city + '}';
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
