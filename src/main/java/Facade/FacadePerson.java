
package Facade;

import entity.person;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class FacadePerson {
 
    EntityManagerFactory emf;
    ArrayList pers = new ArrayList();
    person p;
    
    
    public FacadePerson(EntityManagerFactory emf) {
        this.emf = emf;

    }

    EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    EntityManager em = getEntityManager();
    
    
    public person getPerson(int id) {
        
        try {
           return em.find(person.class, id);
        } finally {
            em.close();
        }
  
    }


   public List<person> getPerson() {
      try {
           return em.createQuery("Select p from person").getResultList();
        } finally {
            em.close();
        }
      
    }

    public  person addPerson(person p) {
       try {
          em.persist(p);
          return p;
        } finally {
            em.close();
        }
    }

    person deletePerson(int id) {
      
       try {
            em.remove(id);
        } finally {
            em.close();
        }
       return null;
    }

    person editPerson(person p, int id, String firstName) {

       try {
            p = em.find(person.class, id);
            p.setFirstName(firstName);
        } finally {
            em.close();
        }
       return null;
    }
}
