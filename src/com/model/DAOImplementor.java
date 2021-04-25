package com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class DAOImplementor implements DAOProvider {
	HibernateTemplate hbtemp;
	

	public HibernateTemplate getHbtemp() {
		return hbtemp;
	}

	public void setHbtemp(HibernateTemplate hbtemp) {
		this.hbtemp = hbtemp;
	}

	@Override
	public void insertBook(Book b) {
		SessionFactory factory=hbtemp.getSessionFactory();
		Session ses=factory.openSession();
		ses.save(b);
		ses.beginTransaction().commit();
		System.out.println("Book inserted!");
		
	}

	@Override
	public void deleteBook(int bid) {
		SessionFactory factory=hbtemp.getSessionFactory();
		
		Session ses=factory.openSession();
		//Book b1=(Book) ses.get(Book.class, b.getBid());
		Book b1=hbtemp.get(Book.class, bid);
		ses.delete(b1);
		ses.beginTransaction().commit();
		System.out.println("Book deleted!");
		
	}

	@Override
	public void updateBook(Book b) {
		SessionFactory factory=hbtemp.getSessionFactory();
		Session ses=factory.openSession();
		Book b1=(Book) ses.get(Book.class, b.getBid());
		b1.setBauthor(b.getBauthor());
		ses.save(b1);
		ses.beginTransaction().commit();
		System.out.println("Book updated!");
		
	}

	@Override
	public void selectBook(int bid) {
		Book b1=hbtemp.get(Book.class, bid);
		System.out.println(b1);
		
	}

	@Override
	public void showAllBooks() {
		SessionFactory factory=hbtemp.getSessionFactory();
		Session ses=factory.openSession();
		String hql = "FROM BookMaster";
		Query query = ses.createQuery(hql);
		List results = query.list();
		
	}

}
