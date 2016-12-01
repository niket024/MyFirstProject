package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Manager
{
public static void main(String[] args)
{
	Configuration config=new Configuration();
	config.configure();
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Student s1=new Student();
	s1.setFirstname("nnn");
	s1.setLastname("ppppp");
	s1.setStudentId(12);
	s1.setYearLevel(4);
	session.save(s1);
	tx.commit();
	session.flush();
	session.close();
	System.out.println("done");
}
}
