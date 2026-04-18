package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestArrayList {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		int choice=0;
		do{
			System.out.println("1. add new employee\n2. delete by id\n 3. update salary\n4. find by id");
			System.out.println("5. display all\n6. display by name\n7. calculate net sal\n8. calculate bonus\n");
			System.out.println("9. sort by id\n10. sort by name\n11. sort by sal\n12 exit\n choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1->{
				System.out.println("1. SalariedEmp\n 2. ContractEmp\n 3. Vendor\n choice:");
				int ch =sc.nextInt();
				boolean ststus=eservice.addNewEmployee(ch);
				if(status) {
					System.out.println("Employee Added Successfully");
				}else {
					System.out.println("Employee Not Added..");
				}
			}
			
            case 2->{
				
			}
            
            case 3->{
				
			}
            
            case 4->{
				
			}
            case 5->{}
            case 5->{}

            case 5->{}

            case 5->{}

            case 5->{}

            
            
			}
			
			
		}while(choice!=12);
		
		
	}

}
