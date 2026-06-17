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
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr= session.beginTransaction();
		
		Address addr=new Address(51,"Wagholi","Pune","Maharashtra",null);
		Address addr1=new Address(52,"Kharadi","Pune","Maharashtra",null);
		
		Student s= new Student(11,"Om","1239658740",addr);
		Student s1=new Student(22,"Vishnu","5698321476",addr1);
		addr.setS(s);
		addr.setS(s1);
		
		session.persist(addr);
		session.persist(addr1);
		session.persist(s1);
		session.persist(s);
		tr.commit();
		session.close();
	/*	Transaction tr=session1.beginTransaction();
		Student s2=session.find(Student.class,11);
		System.out.println(s2);
		tr1.commit();
		session1.close();*/
		sf.close();

	}

}
