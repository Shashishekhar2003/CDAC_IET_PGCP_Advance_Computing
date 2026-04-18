package com.demo.model;

public abstract class Employee extends Person {
	private String dept;
	private String desg;
	public Employee() {
		System.out.println("in Employee default constructor");
	}
	public Employee(int pid, String nm, String m,String dept, String desg) {
		super(pid,nm,m);
		System.out.println("in Employee parametrised constructor");
		this.dept = dept;
		this.desg = desg;
	}
	
	   
	   public Employee(int pid) {
			super(pid);
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
		return super.toString()+ "Employee [dept=" + dept + ", desg=" + desg + "]";
	}	

}
