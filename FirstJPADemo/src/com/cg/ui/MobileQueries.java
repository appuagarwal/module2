package com.cg.ui;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entities.Mobile;

public class MobileQueries
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		//String jpql="SELECT m FROM Mobile m WHERE m.quantity>:qty";
		//TypedQuery<Mobile> query=em.createQuery(jpql,Mobile.class);
		TypedQuery<Mobile> query=em.createNamedQuery("getMobiles",Mobile.class);
		query.setParameter("qty",5);
		List<Mobile> mlist=query.getResultList();
		for(Mobile m:mlist){
			System.out.println(m);
		}
	} 

}
