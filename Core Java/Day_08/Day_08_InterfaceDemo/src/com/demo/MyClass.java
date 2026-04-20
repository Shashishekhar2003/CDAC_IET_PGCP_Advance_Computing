package com.demo;

public class MyClass implements MyInterface,MyInterface2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int m2(int x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		MyInterface.super.m3();
		MyInterface.super.m3();
		System.out.println("in m3 method in my class");
	}
	
	public void mymethod1() {
		System.out.println("in my method1");
	}

	@Override
	public void m22() {
		// TODO Auto-generated method stub
		
	}

}
