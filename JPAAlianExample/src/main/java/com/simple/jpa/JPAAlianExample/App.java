package com.simple.jpa.JPAAlianExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("DemoTB");
    	EntityManager em=emf.createEntityManager();
//    	Alian a=em.find(Alian.class,2);
    	Alian a=new Alian();
    	a.setAid(5);
    	a.setAname("Neha");
    	a.setTech("Python");
    	em.persist(a);
    	System.out.println(a);
    }
}
