package com.demo.model;


public class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(String c ,int len,int br) {
		     super(c);
	      this.length=len;
	      this.breadth=br;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return  super.toString()+ "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	public float calcArea() {
		return length*breadth;
	}
	
	public float calcPerimeter() {
		return 2*(length+breadth);
	}

}
