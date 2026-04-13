package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {
	
	private int sid;
	private String sname;
	private float m1;
	private float m2;
	private float m3;
	private Date jdate;

	// default constructor
	 public Student(){
		System.out.println("In default parameter constructor");
		sid=0;
		sname="null";
		m1=0f;
		m2=0f;
		m3=0f;
		jdate=null;
	}
	 
	 //parametrized constructor
	 public Student( int id,String nm,float m1,float m2,float m3,Date jdt) {
		// System.out.println("in parametrized constructor");
		 this.sid=id;
		 sname= nm;
		 this.m1=m1;
		 this.m2=m2;
		 this.m3=m3;
		 jdate=jdt;
		 
	 }
	 
	 //setter and getter
	 
	 public void setId(int s) {
		 sid=s;
	 }
	 
	  public int getId() {
		  return sid;
	  }
	  
	  public void setSname(String s) {
		  sname=s;
	  }
	 
	  public String getSname() {
		  return sname;
	  }
	  
	  public void setM1(float s) {
		  m1=s;
	  }
	  
	  public float getM1() {
		  return m1;
	  }
	  
	  public void setM2(float s) {
		  m2=s;
	  }
	  
	  public float getM2() {
		  return m2;
	  }

	  public float getM3() {
		  return m3;
	  }

	  public void setM3(float m3) {
		  this.m3 = m3;
	  }

	  public Date getJdate() {
		  return jdate;
	  }

	  public void setJdate(Date jdate) {
		  this.jdate = jdate;
	  }

	  @Override
	  public String toString() {
		  System.out.println("Using toString method");
		  //to convert java date into String format
		  SimpleDateFormat sdf =new SimpleDateFormat ("dd/MM/yyyy");
		  String str=sdf.format(jdate);
		  return "Student [sid=" + sid + ", sname=" + sname + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", jdate="
				+ jdate + "]";
	  }
	  
	  
	  
	
		
	  
	  
	 
	 
	 
	 
}
