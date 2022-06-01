package com.tns.dao;

import com.tns.entity.student;

public interface studentdao
	{
		abstract void addStudent(student student);
		abstract student getStudentById(int ID);
		abstract void updateStudent(student student);
		abstract void removeStudent(student student);
		abstract void commitTransaction();
		abstract void beginTransaction();

	}


