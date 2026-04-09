package com.demo;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int [10];
		int[] b= {34,55,45,23};
	    int[] summerr=ArrayService.findDigitSums(b);
	    for (int i=0;i<summerr.length;i++) {
	    	System.out.println("Sum of digit number:"+ b[i]+"--->"+summerr[i]);
	    	
	    }
        
	    
	   Scanner sc = new Scanner(System.in);
	   ArrayService.acceptData(a);
	   ArrayService.displayData(a);
	   System.out.println("Enter the numer to search:");
	   int num = sc.nextInt();
	   int pos =ArrayService.searchData(a, num);
	   if(pos!=-1) {
		   System.out.println("number found at:	"+pos);
	   }else {
		    System.out.println("number not found");
	   }
	   int s=ArrayService.findSum(a);
	   System.out.println("sum:"+s);
	   int max=ArrayService.findmax(a);
	   int min=ArrayService.findMin(a);
	   System.out.println("max:"+max+"min:"+min);
	   	sc.close();
	}

}
