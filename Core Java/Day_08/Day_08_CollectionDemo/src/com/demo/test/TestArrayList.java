package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> v=new ArrayList<>(20);
		v.add(10);
		v.add(45);
		v.add(264);
		
		System.out.println("size:"+v.size());
		for(int i=0;i<=5;i++) {
			v.add(50+i);
		}
		
		System.out.println("size:"+v.size());
		for(int i=0; i<=25; i++) {
			v.add(25+i);
		}
		System.out.println(v);
		
		System.out.println("size : "+v.size());
		System.out.println(v);
		//remove element from 5 th index position
		v.remove(5);
		v.remove(new Integer(100));
		v.contains(101);

	}

}
