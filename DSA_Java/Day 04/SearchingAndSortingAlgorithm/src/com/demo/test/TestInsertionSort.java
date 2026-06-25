package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.insertionSortAlgorithm;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr= {35,54,10,5,3,45,8,6};
		insertionSortAlgorithm.insertionSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}