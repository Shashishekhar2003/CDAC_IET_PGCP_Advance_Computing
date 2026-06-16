package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr= session.beginTransaction();
		Address addr= new Address(555,"Karve Nagar","Pune","Maharatshtra");
		Address addr2= new Address(557,"Karve Nagar","Pune","Maharatshtra");
		Address addr1= new Address(666,"Warje","Pune","Maharashtra");
		Student s= new Student(201,"Shashi","9307713328",addr2);
		Student s1= new Student(202,"Yash","8484871127",addr1);
		Student s2= new Student(203,"Sandesh","8446019058",addr);
		
		session.persist(addr2);
		session.persist(s);
		
		 //  session.persist(addr1);session.persist(addr);
		 // session.persist(s2); session.persist(s1);
		 
		tr.commit();
	//	session.close();
	/*
	 * Session session1=sf.openSession(); Transaction
	 * tr1=session.beginTransaction(); Student s3=session1.find(Student.class,11);
	 * System.out.println(s3); tr1.commit(); session1.close();
	 */
		sf.close();

	}

}
