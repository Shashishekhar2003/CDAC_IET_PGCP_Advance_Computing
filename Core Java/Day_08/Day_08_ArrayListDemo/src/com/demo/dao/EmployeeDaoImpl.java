package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao {
             static List<Employee> elist;
             static {
            	 elist=new ArrayList<>();
            	 elist.add(new SalariedEmp(45,"Akshay","456213","Hr","mgr",489863,4556678));
            	 elist.add(new ContractEmp(13,"Yash","55789","admin","asst",45,655666));
             }
			 @Override
			 //add a object in the list at the end
			 public boolean save(Employee e) {
				return elist.add(e);
				
			 }
			 @Override
			 public List<Employee> findAll() {
				return elist;
			 }
			 @Override
			 public Employee findById(int id) {
				 int pos=elist.indexOf(new SalariedEmp(id) );
				 if(pos!=-1) {
					 return elist.get(pos);
				 }
				 return null;
			 }
}