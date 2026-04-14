package com.demo.model;

public class Employee extends Person{
	private String dept;
	private String desg;

	public Employee() {
		System.out.println("in Employee Default constructor");
	}
	
	
	
	public Employee( int pid, String pname,String mob,String dept, String desg) {
		super( pid,pname,mob);
		this.dept = dept;
		this.desg = desg;
		//this.toString = toString;
	}



	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}



	@Override
	public String toString() {
		return super.toString() +"Employee [dept=" + dept + " desg=" + desg + "]";
	}
	
	
}
