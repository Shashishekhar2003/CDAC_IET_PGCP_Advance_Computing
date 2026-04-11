package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	
	private int sid;
	private String sname;
	private int m1;
	private float m2;
	private float m3;
	private Date jdate;
	
	//default constructor 
	public Student(){
		System.out.println("In student default constructor");
		sid=0;
		sname="null";
		m1=0;
		m2=0.0f;
		m3=0.0f;
		jdate=null;
	}
	
	//parametrized constructor
	public Student(int id, String nm, int m1, float m2, float m3, Date jdt ) {
		System.out.println("In Parametrized constructor");
		this.sid=id;
	         sname=nm;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		jdate=jdt;
	}
	
	//setter and getter method 
	
	public void setSid(int s) {
        sid=s;		
	}
	
	public  int getSid() {
		return sid;
	}
	
	public void setSname(String s) {
		sname=s;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setM1(int s) {
		m1=s;
	}
	
	public int getM1() {
		return m1;
	}
	
	public void setM2(float s) {
		m2=s;
	}
	
	public float getM2() {
		return m2;
	}
	
	public void setM3(float s) {
		m3=s;
	}
	
	public float getM3() {
		return m3;
	}
	
	public void setJdate(Date s) {
		jdate=s;
	}
	
	public Date getJdate() {
		return jdate;
	}
	
	//To String method 
	public String toString () {
		System.out.println("In To String Method");
		//convet the  java date into string format dd/mm/yyyy
		SimpleDateFormat sdf=new SimpleDateFormat ("dd/mm/yyyy");
		String str =sdf.format(jdate);
		return "Id:"+ sid +"Name:"+ sname + " Marks m1:"+ m1 + "Marks m2:"+ m2 + "Marks m3" + m3 + "Joining Date:"+ str;
		
	
	}
	

}
