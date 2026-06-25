package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.QuickSortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr= {45,6,8,32,45,5,6,96,42,7,4};
		QuickSortAlgorithm.quickSort(arr, 0, arr.length-1);
		System.out.println("sorted array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------");
		int[] arr1= {44,2,6,7,45,6,32,10};
		QuickSortAlgorithm.quickSort(arr1, 0, arr1.length-1);
		System.out.println("sorted array : ");
		System.out.println(Arrays.toString(arr1));

	}

}