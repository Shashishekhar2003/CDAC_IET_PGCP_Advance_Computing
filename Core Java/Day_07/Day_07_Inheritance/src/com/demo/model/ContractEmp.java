package com.demo.model;

public class ContractEmp extends Employee {
	private float hrs;
	private double charges;
	
	public ContractEmp() {
		super();
	}
	
	public ContractEmp(int pid, String pname,String mob,String dept, String desg,float hrs,double charges) {
		super(pid,pname,mob,dept,desg);
		this.hrs=hrs;
		this.charges=charges;	
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
	
	public String toString() {
		return super.toString()+"ContractEmp[hrs="+hrs+",charges="+charges+"]";
	}
	
	public double calculateSal() {
		System.out.println("in contractemp calculate sal");
		return hrs*charges;
	}

}
