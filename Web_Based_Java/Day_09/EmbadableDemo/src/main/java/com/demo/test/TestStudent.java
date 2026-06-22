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
		Address addr=new Address (51,"Aundh","Pune","Maharashtra");
		Student s= new Student(45,"Akshay","5978641836",addr);
		
		Address addr1=new Address (52,"Karve Nagar","Pune","Maharashtra");
		Student s1= new Student(46,"Shashi","9307713328",addr1);
		
		
		
		session.persist(s);
		session.persist(s1);
		tr.commit();
		System.out.println(s);
		System.out.println(s1);
		session.close();

	}

}
