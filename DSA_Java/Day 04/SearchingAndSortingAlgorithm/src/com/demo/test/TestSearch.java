package com.demo.test;

import com.demo.searchs.SearchingService;

public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,4,5,23,2,10,51};
		int pos = SearchingService.sequentialSearch(arr,23);
		if(pos!=-1) 
			System.out.println("Number found at: " + pos);
			else
				System.out.println("Not Found");
			int []arr1= {5,7,12,15,26,31,33,34,38,56,67,77,78,89} ;
			pos=SearchingService.binarySearchRecurssive (arr1,31, pos, pos);
			if(pos!=-1)
				System.out.println("number found at : "+pos);
		else
			System.out.println("not found");

			
			pos=SearchingService.binarySearchRecurssive(arr1, 31,0,14);
			if(pos!=-1)
				System.out.println("number found at : "+pos);
		else
			System.out.println("not found");
			

	}
}