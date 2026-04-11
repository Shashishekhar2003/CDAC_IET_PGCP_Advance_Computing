package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Date;

public class StudentService {
	public static void addNewStudent (Student [] sarr) {
		Scanner sc=new Scanner (System.in);
		for (int i=0; i<sarr.length;i++) {
			System.out.println("Enter id:");
			int sid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String sname=sc.nextLine();
			System.out.println("Enter marks:");
			int m1=sc.nextInt();
			System.out.println("Enter Marks m2");
			float m2=sc.nextFloat();
			System.out.println("Enter Merks m3:");
			float m3=sc.nextFloat();
			System.out.println("Enter date (dd/mm/yyyy)");
			String dt=sc.next();
			SimpleDateFormat sdf=new SimpleDateFormat ("dd/MM/yyyy");
			Date jdt=null;
			try {
				jdt=sdf.parse(dt);
			}catch (ParseException e) {
				e.printStackTrace();
			}
			sarr[i]=new Student (sid ,sname,m1,m2,m3,jdt);
		}
	}
	
	public static void displayall(Student[]sarr) {
		for (Student s:sarr) {
			System.out.println(s);
		}
		Stream.of(sarr).forEach(s1->System.out.println(s1));
		Stream.of(sarr).forEach(System.out::println);
	}

}
