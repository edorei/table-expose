package com.edorei.expose.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.edorei.expose.test.model.Country;

public class App {
    public static void main( String[] args ) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("edoreiJPA");
    	EntityManager entityManager = emf.createEntityManager();
    	
    	entityManager.getTransaction().begin();
    	
    	TypedQuery<Country> query = entityManager.createQuery("from Country",Country.class);
    	List<Country> countries = query.getResultList();
    	for (Country country : countries) {
			System.out.println(country);
		}
    	
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	emf.close();
    }
}
