package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookCRUDMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Book b=context.getBean("b",Book.class);
		DAOImplementor di=context.getBean("impl",DAOImplementor.class);

		//di.selectBook(101);
		//di.insertBook(b);
		//b.setBauthor("shaktiman");
//di.updateBook(b);
		//di.deleteBook(101);
		di.showAllBooks();

	}

}//sorry forgot to do that

