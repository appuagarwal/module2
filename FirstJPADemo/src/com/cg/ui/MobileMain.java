package com.cg.ui;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entities.Mobile;

public class MobileMain {

	public static void main(String[] args) 
	{
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		//Mobile mob=em.find(Mobile.class,1001);
	//	System.out.println(mob);
		Scanner sc=new Scanner(System.in);
		Mobile mob=new Mobile();
		System.out.println("Enter mobile name");
		mob.setMobileName(sc.next());
		System.out.println("Enter price:");
		mob.setMobilePrice(sc.nextInt());
		System.out.println("Enter Quantity");
		mob.setMobileQuantity(sc.next());
		
		em.getTransaction().begin();
		em.persist(mob);
		em.getTransaction().commit();
		
		System.out.println("Mobile details inserted");
		
	}

}
