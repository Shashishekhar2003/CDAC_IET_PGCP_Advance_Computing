package com.demo;

import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(45,"Shashi",90,92,95,new Date());
		System.out.println(s);
		
		Student s1=new Student(46,"Akshay",91,93,99,new Date());
		System.out.println(s1);
		
		Student s2=new Student();
		s2.setSname("Yash");
		s2.setSid(40);
		s2.setM1(93);
		s2.setM2(95);
		s2.setM3(96);
		s2.setJdate(new Date());
		System.out.println(s2);
		

	}

}
