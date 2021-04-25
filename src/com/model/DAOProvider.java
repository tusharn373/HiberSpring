package com.model;

public interface DAOProvider {
	public  void insertBook(Book b);
	public  void deleteBook(int bid);
	public  void updateBook(Book b);
	public  void selectBook(int bid);
	public  void showAllBooks();
}
