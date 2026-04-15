package com.demo.service;

import java.util.Scanner;

import com.demo.model.*;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class EmployeeService {
	static Employee[] emparr;
	static int count;
	static {
		emparr=new Employee[100];
		emparr[0]=new SalariedEmp(10,"Yash","1234567890","hr","manager",454545, 123);
		emparr[1]=new ContractEmp(45,"Akshay","1459687236","manager","general manager",450000,2300);
		count=2;
	}
	
	public static boolean addNewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		if(count<emparr.length) {
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String nm=sc.next();
			System.out.println("Enter Mobile No");
			String mob=sc.next();
			System.out.println("Enter Dept");
			String dept=sc.next();
			System.out.println("Enter Desg");
			String desg=sc.next();
			if(ch==1) {
				System.out.println("Enter sal");
				double sal=sc.nextDouble();
				
				emparr[count]=new SalariedEmp(id,nm,mob,dept,desg,sal, 123);
			}else if(ch==2){
				System.out.println("Enter hrs");
				float hrs=sc.nextFloat();
				System.out.println("enter charges");
				double charges=sc.nextDouble();
				emparr[count]=new ContractEmp(id,nm,mob,dept,desg,hrs,charges);
			}else if (ch==3) {
				//add code for vendor
			}
			count++;
			return true;
}
return false;
}
				
	public static Employee[] getAll() {
		return emparr;
	  }
	  public static Employee findById(int id) {
		     int pos=searchById(id);
		     if (pos!=-1) {
		    	 return emparr[pos];
		     }
		     return null;
	  }
	  private static int searchById(int id) {
		   for(int i=0;i<count;i++) {
			   if(emparr[i].getPid()==id) {
				   return i;
			   }
		   }
		   return -1;
	  }
	  public static Employee[] findByName(String nm) {
		Employee[] arr=new Employee[count];
		int cnt=0;
		for(int i=0;i<count;i++) {
			if(emparr[i].getPname().equals(nm)) {
				arr[cnt]=emparr[i];
				cnt++;
			}
		}
		if(cnt>0) {
			return arr;
		}
		return null;
	  }
	  public static boolean updateById(int id, double sal) {
		Employee e=findById(id);
		if(e!=null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp)e).setSal(sal);
			}else if(e instanceof ContractEmp) {
				((ContractEmp)e).setCharges(sal);
			}
			
			return true;
		}
		return false;
	  }
	  public static double findNetSalary(int id) {
		Employee e=findById(id);
		if(e!=null) {
			   return e.calculateSal();
		}
		return -1;
	  }
	  public static boolean deleteById(int id) {
		int pos=searchById(id);
		if(pos!=-1) {
			for(int i=pos;i<count;i++) {
				  emparr[i]=emparr[i+1];
			}
			count--;
			return true;
			
		}
		
		return false;
	  }
      
}

		
