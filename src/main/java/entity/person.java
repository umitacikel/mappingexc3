package entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@Entity
public class person {
   
    @Id
    int id;
    String firstName;
    String lastName;
    int phone;
    int age;

    
    @Temporal (TemporalType.DATE)
    private Date born;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Temporal(TemporalType.TIME)
    private Date startTid;
    
//    @OneToOne
//    private Adress adr;
//    
    @ManyToMany
    private List<Adress> adresses = new ArrayList();

  
    @OneToOne
    private Adress address;
    
    
    
    
    public person(){}
    
    public person(int i, String fn, String ln, int p){
    id = i;
    firstName = fn;
    lastName = ln;
    phone=p;
    
    }
    
    
     @Override
    public String toString() {
        return "person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", age=" + age + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAdresses(List<Adress> adresses) {
        this.adresses = adresses;
    }

    public List<Adress> getAdresses() {
        return adresses;
    }
    
    public Date getBorn() {
        return born;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getStartTid() {
        return startTid;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setStartTid(Date startTid) {
        this.startTid = startTid;
    }
    
   
    }

