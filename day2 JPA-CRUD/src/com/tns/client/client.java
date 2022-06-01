package com.tns.client;


import com.tns.entity.student;
import com.tns.service.studentService;
import com.tns.service.studentServiceimpl;

public class client 
{
	public static void main(String[] args)
	{
		studentService service=new studentServiceimpl();
		student student=new student();
		//CRUD Operation
		//create
		student.setId(105);
		student.setName("shankar");
		service.addStudent(student);
		
		//Retreive data-find();
		student=service.findstudentById(101);
		System.out.println("ID: "+student.getId());
		System.out.println("ID: "+student.getName());
		
		
		//update
		student=service.findstudentById(100);
		student.setName("Vinay");
		service.updateStudent(student);
		
		//delete
		student=service.findstudentById(100);
		service.removeStudent(student);
		
		

	}


}
