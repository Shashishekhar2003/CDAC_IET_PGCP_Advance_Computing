package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
	
      private	int [] arr;
      private int count;
      
	    
	    public MyArray() {
	    	arr =new int[10];
	    	count=10;
	    }
	    
	    public MyArray(int size) {
	    	super();
	    	arr= new int[size];
	    	count=0;
	    }
	    
	    public MyArray(int arr [], int count) {
	    	this.arr = arr;
	    	this.count=count;
	    }
	    
	    public int getCapacity() {
	    	return arr.length;
	    }
	    
	    public int getcount() {
	    	return count;
	    }
	    
	    
	    //add at the end of the array
		 public boolean add(int x) {
			 if(count<arr.length) {
			  arr[count]=x;
			  count++;
			  return true;
			 }else {
				 return false;
			 }
		 }
	    
	    // add in between the array 
	    public boolean add(int x, int pos) {
	    	if((count<arr.length)&& (pos<count)) {
	    		for (int i=count;i>=pos;i--) {
	    			arr[i]=arr[i-1];
	    		}
	    		//add x at the position 
	    		arr[pos]=x;
	    		count++;
	    		return true;
	    	}else {
	    		return false;
	    	}
	    }
	    
	    // search the given value and return its given position
	    public int SearchByValue (int val) {
	    	for(int i=0;i<count;i++) {
	    		if (arr[i]==val) {
	    			return i;
	    		}
	    	}
	    	return -1;
	    }
	    
	    
	    // delete from the given position
	    public boolean deleteByPosition(int pos) {
	    	//check weather position is in limit
	    	if(pos<count) {
	    		//shift all values from pos+1 to count --> 1 location left
	    		for( int i=pos+1;i<count;i++) {
	    			arr[i-1]=arr[i];
	    		}
	    		//reduce count by 1
	    		count--;
	    		return true;
	    	}
	    	//position is out of bounce
	    	return false;
	    }
	    
	    public int deleteByValue(int value) {
	    	int pos=SearchByValue(value);
	    	if(pos!=-1) {
	    		boolean flag=deleteByPosition(pos);
	    		if(flag) {
	    			return pos;
	    		}
	    	}
	    	return -1;
	    }
	    
	    
	  //flag=true then rotate right --->num of times
	  //flag=false then rotate left---> num of times
	    public void rotateArray(boolean flag,int num) {
	    	if (flag) {
	    		//right rotation
	    		for(int j=0;j<num;j++) {
	    			int temp=arr[count-1];
	    			for ( int i=count-1;i>0;i++) {
	    				arr[i]=arr[i-1];
	    			}
	    			arr[0]=temp;
	    			
	    		}
	    	}else {
	    		//left rotation
	    		for(int j=0;j<num;j++) {
	    			int temp=arr[0];
	    			for(int i=0;i<count-1;i++) {
	    				arr[i]=arr[i+1];
	    			}
	    			arr[count-1]=temp;
	    		}
	    	}
	    }
	  
	    // if flag is true then reverse the array in place 
	    // else reverse the ccopy of the array
	    
	    public int[] reverseArray(boolean flag) {
			 if(flag) {
			     for(int i=0,j=count-1;i<j;i++,j--) {
			    	   int temp=arr[i];
			    	   arr[i]=arr[j];
			    	   arr[j]=temp;
			     }	
			     return arr;
			}else {
				int[] arr1 = new int[count];
				for(int i=count-1,j=0;i>=0;i--,j++) {
					arr[j]=arr[i];
				}
				return arr1;
			}
	    	
	    }
	    
	    public int findMax () {
	    	int Max=arr[0];
	    	for(int i=0;i<count;i++) {
	    		if (arr[i]>Max) {
	    			Max=arr[i];
	    		}
	    	}
	    	return Max;
	    }
	    
	    //Assumption ----array contains all +ve Value Position
	    public int[] exchangeIndexValue() {
	    	//find Maximum number
	    	int maxnum=findMax();
	    	//create a new array of size max+1
	    	int[] arr1= new int[maxnum+1];
	    	//initialize new array with -1
	    	for(int i=0;i<arr1.length;i++) {
	    		arr1[i]=-1;
	    	}
	    	
	    	//then copy indexes at value posituions
	    	for(int i=0;i<count;i++) {
	    		int b=arr[i];
	    		arr1[b]=i;
	    	}
	    	return arr1;
	    }
	    
	    //find sum of all numbers in the array 
	    public int findSum() {
	    	int sum=0;
	    	for(int i=0;i<count;i++) {
	    		sum+=arr[i];
	    	}
	    	return sum;
	    }

		@Override
		public String toString() {
			return "MyArray [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
		}	    

		
     }
