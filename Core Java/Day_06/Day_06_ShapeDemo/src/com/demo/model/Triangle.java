package com.demo.model;

public class Triangle extends Shape {
	private int s1;
	private int s2;
	private int height;
	private int base;
	
	 public Triangle() {
		 super();
		 
	 }
	 
	 public Triangle(String c, int s1,int s2,int height,int base) {
		 super(c);
		 this.base=base;
		 this.height=height;
		 this.s1=s1;
		 this.s2=s2;
	 }
	 
	 

	 public int getS1() {
		return s1;
	}

	 public void setS1(int s1) {
		 this.s1 = s1;
	 }

	 public int getS2() {
		 return s2;
	 }

	 public void setS2(int s2) {
		 this.s2 = s2;
	 }

	 public int getHeight() {
		 return height;
	 }

	 public void setHeight(int height) {
		 this.height = height;
	 }

	 public int getBase() {
		 return base;
	 }

	 public void setBase(int base) {
		 this.base = base;
	 }
	 
	 public  String toString() {
		 return super.toString()+"Triangle[s1="+s1+",s2="+s2+",height="+height+",base="+base+"]";
	 }

	 @Override
	 public float calcArea() {
		// TODO Auto-generated method stub
		return 0;
	 }

	 @Override
	 public float calcPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	 }
	

}
