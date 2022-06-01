package com.tns.service;

import com.tns.entity.student;

public interface studentService
{
	
		abstract void addStudent(student student);
		abstract student findstudentById(int ID);
		abstract void updateStudent(student student);
		abstract void removeStudent(student student);

	

}
