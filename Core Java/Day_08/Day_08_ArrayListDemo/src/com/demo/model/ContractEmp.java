package com.demo.model;

public abstract class ContractEmp extends Employee {
	private float hrs;
	private double charges;
	
	public ContractEmp() {
		System.out.println("in ContractEmp default constructor");
	}

	public ContractEmp(int pid, String nm, String m,String dept, String desg,float hrs, double charges) {
		super(pid,nm,m,desg,dept);
		System.out.println("in ContractEmp Parametrized constructor");
		this.hrs = hrs;
		this.charges = charges;
	}

	public float getHrs() {
		return hrs;
	}

	public void setHrs(float hrs) {
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	public double calculateSal() {
		System.out.println("in contractemp calculate sal");
		return hrs*charges;
		
	}	
	

}