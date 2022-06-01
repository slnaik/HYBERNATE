package com.tns.service;

import com.tns.dao.studentdao;
import com.tns.dao.studentimplement;
import com.tns.entity.student;

public class studentServiceimpl implements studentService
{
	
		private studentdao dao;
		

		public studentServiceimpl()
		{
			dao=new studentimplement();
		}


		@Override
		public void addStudent(student student)
		{
			dao.beginTransaction();
			dao.addStudent(student);
			dao.commitTransaction();
			
			
		}


		@Override
		public student findstudentById(int ID)
		{
			student student =dao.getStudentById(ID);
			return student;
			
			
		}


		@Override
		public void updateStudent(student student) 
		{
			dao.beginTransaction();
			dao.updateStudent(student);
			dao.commitTransaction();
			
			
		}


		@Override
		public void removeStudent(student student)
		{
			dao.beginTransaction();
			dao.removeStudent(student);
			dao.commitTransaction();
			
			
		}

		
}
