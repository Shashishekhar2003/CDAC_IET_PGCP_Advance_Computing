package com.demo;

import java.util.Scanner;
import java.util.stream.Stream;


public class TestStudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	            int choice=0;
	            Scanner sc = new Scanner(System.in);
	            do {
	            	System.out.println("All MENU:");
	            	System.out.println(" 1. Add New Student:\n 2. Delete By Id:\n 3. Update By Id:\n 4. Display All:\n 5. Display By Id:\n 6. Display BY Name:\n 7.Exit:\n choice:");
	            	
	            	choice=sc.nextInt();
	            	switch(choice) {
	            	
	            	case 1->{
	            		boolean status=StudentService.addNewStudent();
	            		if(status) {
	            			System.out.println("Student Added Successfully");
	            		}else {
	            			System.out.println("Student not added");
	            		}   
	            		System.out.println("===========================================");
	                }
	            
	            	
	            	case 2->{
	            		System.out.println("....................................................................................");
	            		System.out.println("Enter id by delete");
	            		int id=sc.nextInt();
	            		int flag=StudentService.deleteById(id);
	            		if(flag==1) {
	            			System.out.println("found and deleted successfully");
	            		}else if (flag==2){
	            			System.out.println("found and not deleted successfully");
	            		}else {
	            			System.out.println("Not found");
	            		}
	            		System.out.println("....................................................................................");
	                }
	            	
	            	case 3->{
	            		System.out.println("....................................................................................");
	            		System.out.println("Enter id to update data");
	            		int id=sc.nextInt();
	            		System.out.println("Enetr new m1");
	            		float nm1=sc.nextFloat();
	            		System.out.println("Enter new m2");
	            		float nm2=sc.nextFloat();
	            		System.out.println("Enter new m3");
	            		float nm3=sc.nextFloat();
	            		boolean status=StudentService.UpdateById(id,nm1,nm2,nm3);
	            		if (status) {
	            			System.out.println("updation done");
	            		}else {
	            			System.out.println("not done");
	            		}
	            		System.out.println("....................................................................................");
	            	}
	            	
	            	
	            	case 4->{
	            		System.out.println("....................................................................................");
	            		Student[] arr=StudentService.displayAll();
						for(Student s:arr) {
							if(s!=null) {
								System.out.println(s);
							}else {
								break;
							}
						}
						System.out.println("....................................................................................");
	               	}
	            	
	            	case 5->{
	            		System.out.println("....................................................................................");
	            		System.out.println("enter id to search");
						int id=sc.nextInt();
						Student s=StudentService.findById(id);
						if(s!=null) {
							System.out.println(s);
						}else {
							System.out.println("not found");
						}
						System.out.println("....................................................................................");
	                }
	            	
	            	case 6->{
	            		System.out.println("....................................................................................");
	            		System.out.println("Enter name to search");
						String nm=sc.next();
						Student[] arr=StudentService.findByName(nm);
						if(arr!=null) {
							for(Student s:arr) {
								if(s!=null) {
									System.out.println(s);
								}else {
									break;
								}
							}
						}else {
							System.out.println("not found");
						}
						System.out.println("....................................................................................");
	               	}
	            	
	            	case 7->{
	            		sc.close();
	            		System.out.println("thank you for visiting.....");
	                 	}
	            	default->{
	            		System.out.println("Wrong choice");
	            	    }
	            	    }
	                } while (choice!=7);

	}

}
