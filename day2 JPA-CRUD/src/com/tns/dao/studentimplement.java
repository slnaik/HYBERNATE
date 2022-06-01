package com.tns.dao;



import javax.persistence.EntityManager;

import com.tns.entity.student;

public class studentimplement implements studentdao
{
private EntityManager entityManager;
	

	public studentimplement() 
	{
		entityManager=jpautil.getEntityManager();
		
	}


	@Override
	public void addStudent(student student)
	{
		entityManager.persist(student);
	}


	@Override
	public student getStudentById(int ID) 
	{
		student student =entityManager.find(student.class,ID);
		return student;
		
		
	}


	@Override
	public void updateStudent(student student) 
	{
		entityManager.merge(student);
		
		
		
	}


	@Override
	public void removeStudent(student student) 
	{
		entityManager.remove(student);
		
		
		
	}


	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
		
		
	}


	@Override
	public void beginTransaction()
	{
		
		entityManager.getTransaction().begin();
		
	}

	
}
	

