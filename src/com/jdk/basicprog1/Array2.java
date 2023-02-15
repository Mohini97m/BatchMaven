package com.jdk.basicprog1;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,23,43,54,76,87,45}; //9=>36 byte
		// print from index 0 to last index
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] +",");
		}
		
		// Reverse the array
		
		for(int i=0; i < (a.length/2); i++) // 9 times 4 times
		{
			int c= a[i];
			a[i]= a[(a.length-1)-i];
			a[(a.length-1)-i]=c;   
		}
		System.out.println();
		
		// print from 0 to last index
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] +",");
		}
		

	}

} 
	
