package com.demo;

public class TestStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] sarr=new Student [5];
		StudentService.addNewStudent(sarr);
		StudentService.displayall(sarr);

	}

}
