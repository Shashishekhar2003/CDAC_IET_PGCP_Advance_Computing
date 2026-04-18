package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;


public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		this.edao = new EmployeeDaoImpl();
	}
	
	@Override
	public boolean addNewEmployee(int ch) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter mob");
		String mob=sc.next();
		System.out.println("Enter dept");
		String dept=sc.next();
		System.out.println("Enter desg");
		String desg=sc.next();
		Employee e=null;
		if(ch==1) {
			System.out.println("Enter salary");
			double s= sc.nextDouble();
			e= new SalariedEmp(id,nm,mob,dept,desg,s);
			edao.save(e);
		
		}else if (ch==2){
			System.out.println("Enter Hrs");
			float hrs=sc.nextFloat();
			System.out.println("Enter charges");
			double c=sc.nextDouble();
			e=new ContractEmp(id,nm,mob,dept,desg,hrs,c);
			
		}else if(ch==3){			
			
		}
		return edao.save(e);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return edao.findById(id);
	}
	
	

}
