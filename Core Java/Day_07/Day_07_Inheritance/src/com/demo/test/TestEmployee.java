package com.demo.test;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class TestEmployee {
	public static void main(String[] args) {
		SalariedEmp se=new SalariedEmp(10,"Yash","1234567890","hr","manager",454545, 123);
		System.out.println(se);
		
		ContractEmp ce=new ContractEmp(45,"Akshay","1459687236","manager","general manager",450000,2300);
		System.out.println(ce);
		
		System.out.println(se.calculatebonus(3.21f));
		System.out.println(se.calculateSal());
		
		System.out.println(ce);
		System.out.println(ce.calculateSal());
		
		Employee e1 = new Employee();
		e1.setMob("9307713328");
		System.out.println(e1.getMob());
		
	}

}
