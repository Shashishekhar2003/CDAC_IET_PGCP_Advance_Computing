package com.demo.test;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Employee e1=new Employee(45,"Shashi","9307713328","Developer","Senior Devp");
		System.out.println(e1);
		SalariedEmp se= new SalariedEmp(30,"Asit","7972474008","Hr","Senoir Mang",95000,4500);
		System.out.println(se);
		ContractEmp me = new ContractEmp(20,"Yash","8484871127","Developer","Contractbase",80000,5500);
		System.out.println(me);

	}

}
