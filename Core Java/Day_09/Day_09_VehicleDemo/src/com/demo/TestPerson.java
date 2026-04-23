package com.demo;

public class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person("Shashi","455");
		System.out.println(p1);
		
		Person p2=new Person("Asit","8545");
		System.out.println(p2);
			
		Person p3=new Person();
		p3.setPname("Omkar");
		p3.setMob("12345");
		System.out.println(p3);

	}

}