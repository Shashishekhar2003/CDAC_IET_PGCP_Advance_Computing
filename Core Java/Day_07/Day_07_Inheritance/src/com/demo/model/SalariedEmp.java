package com.demo.model;

public class SalariedEmp extends Employee{
	private double sal;
	private double bonus;
	
	public SalariedEmp() {
		System.out.println("is default constructor called");
	}
	
	public SalariedEmp(int pid, String pname,String mob,String dept,String desg,double sal,double bonus) {
		super(pid,pname,mob,dept,desg);
		System.out.println("is parametrized constructor called");
		this.bonus=bonus;
		this.sal=sal;	
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString()+ "SalariedEmp [sal="+sal+",bonus="+bonus+"]";
	}

    public double calculateSal() {
    	System.out.println("Calculate Employee salary");
    	return sal+0.10*sal+0.15*sal-0.8*sal+bonus;
    }
    public double calculatebonus(float perc) {
    	System.out.println("calculate Employee Bonus");
    	return sal*perc;
    }
}
