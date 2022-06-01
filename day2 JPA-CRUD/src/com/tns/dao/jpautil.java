package com.tns.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpautil
{
	
		private static  EntityManagerFactory factory;
		private static  EntityManager entityManager;
		static
		
		{
			factory=Persistence.createEntityManagerFactory("jpa-PU");
		}
		public static EntityManager getEntityManager()
		{
			if(entityManager==null || !entityManager.isOpen())
			{
				entityManager=factory.createEntityManager();
			}
			return entityManager;
			
		}

	}


