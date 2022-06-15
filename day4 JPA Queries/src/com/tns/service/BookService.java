package com.tns.service;
import java.util.List;

import com.tns.entities.Book;

public interface BookService
{
	public abstract BookService getBookById(int id);
	public abstract List<BookService>getBookByTitle(String title);
	public abstract List<BookService>getAuthorBooks(String author);
	public abstract List<BookService>getBookInPriceRange(double low,double high);
	public abstract List<BookService>getAllBooks();
	public abstract Long getBookCount();
	
	

	

}
