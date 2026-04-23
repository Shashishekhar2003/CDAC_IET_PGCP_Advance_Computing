package com.demo.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {
	
	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<>();
		hs.add(45);
		hs.add(35);
		hs.add(36);
		hs.add(99);
		System.out.println(hs.add(264));
		System.out.println(hs);
		
		Set<Integer> ts=new TreeSet<>();
		for(Integer ob:hs) {
			ts.add(ob);
		}
		System.out.println(ts);
		ts.remove(99);
		System.out.println(ts);
	}

}
