/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import javax.persistence.Persistence;

/**
 *
 * @author umita
 */
public class FacadeTest {
    
    public static void main(String[] args) {
        FacadePerson fp = new FacadePerson(Persistence.createEntityManagerFactory("jpa_pu"));
       
        
  
    }
  
}
