package com.edorei.expose.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.edorei.expose.Expose;
import com.edorei.expose.api.ExposeRule;
import com.edorei.expose.test.model.City;
import com.edorei.expose.test.model.Country;

public class App {
    public static void main( String[] args ) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("edoreiJPA");
    	EntityManager entityManager = emf.createEntityManager();
    	
    	entityManager.getTransaction().begin();
    	
    	TypedQuery<City> query = entityManager.createQuery("from City",City.class);
    	List<City> cities = query.getResultList();
    	   	
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	emf.close();
    	
    	ExposeRule<City> expose = new Expose<City>();
    	expose.toExcel(cities);
    }
}
