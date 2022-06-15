package com.tns.service;
import java.util.List;

import com.tns.dao.BookDao;
import com.tns.dao.BookDaoImpl;
import com.tns.entities.Book;

public class BookServiceImpl implements BookService
{
	private BookDao dao;
	public BookServiceImpl()
	{
		dao=new BookDaoImpl();
	}
	
	@Override
	public BookService getBookById(int id) {
		return (BookService) dao.getBookById(id);
	}

	@Override
	public List<BookService> getBookByTitle(String title) {
		return null;
	}

	@Override
	public List<BookService> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookService> getBookInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookService> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}

}


