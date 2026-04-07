package com.demo;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Length: "+args.length);
         int sum=0; 
         for(int j=0;j<args.length;j++){
             sum=sum+Integer.parseInt(args[j]);	   
         }
			  System.out.println("Addition:"+sum);

	}

}
