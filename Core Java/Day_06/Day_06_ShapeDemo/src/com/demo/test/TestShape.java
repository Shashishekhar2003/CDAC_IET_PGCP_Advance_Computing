package com.demo.test;

import com.demo.model.Circle;
import com.demo.model.Shape;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c =new Circle("Orange", 5);
		System.out.println(c);
		
		Shape s = new Circle("white",4);
		System.out.println(s);
		System.out.println("Area:"+s.calcArea());
		System.out.println("Perimeter:"+s.calcPerimeter());
		
		((Circle)s).m1();
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Shape);
		Object ob=s;
		

	}

}
