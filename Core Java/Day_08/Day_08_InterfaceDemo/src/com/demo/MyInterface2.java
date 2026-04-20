package com.demo;

public interface MyInterface2 {
	void m1();   //public abstract
	default void m3() {
		System.out.println("in m3");
	}
	
	void m22();
	default void m23() {
		System.out.println("in m23 default method");
	}

}
