package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manager1 {
public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate1.cfg.xml");
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Person p1=new Person();
	p1.setId(123);
	p1.setFname("abc");
	p1.setLname("xyz");
	p1.setAge(24);
	session.save(p1);
	tx.commit();
	session.close();
	System.out.println("done");
}
}
