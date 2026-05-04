package com.demo.test;

import com.demo.stacks.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) {
		MyStackList ob = new MyStackList();
		ob.push(23);
		ob.push(33);
		ob.push(63);
		ob.push(43);
		ob.push(25);
		ob.push(45);
		System.out.println("----------");
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
	}

}
