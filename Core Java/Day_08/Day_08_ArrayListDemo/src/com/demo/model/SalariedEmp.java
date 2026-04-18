package com.demo.model;

public abstract class SalariedEmp extends Employee {
	private double sal;
	private double bonus;
	
	
	public SalariedEmp() {
		System.out.println("in SalariedEmp default constructor");
	}


	public SalariedEmp(int pid, String nm, String m,String dept, String desg,double sal, double bonus) {
		super(pid,nm,m,dept,desg);
		System.out.println("in SalariedEmp parametrized constructor");
		this.sal = sal;
		this.bonus = bonus;
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


	@Override
	public String toString() {
		return  super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	public double CalculateSal() {
		System.out.println("in salariedemp calculatesal");
		return sal+0.10*sal+0.15*sal-0.08*sal+bonus;
	}
	
	public double calculatebonus(float perc) {
		bonus=sal*perc;
		return bonus;
		
	}

}
