package com.demo;

public interface MtFunctionInterface {
	void method1();
	default void m2() {
	System.out.println("test1");
	}

}
