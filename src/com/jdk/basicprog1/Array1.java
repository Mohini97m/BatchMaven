package com.jdk.basicprog1;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /// Declaration & Initialization
		
		int a[]= {12,23,43,54,76,87,45,87};
		
		// total data stored in the array i.e. Size/length
		int size= a.length;
		int lastIndex= a.length-1;
		
		System.out.println("Size=" + size);
		System.out.println("lastIndex=" + lastIndex);
		//oroginal value
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] +",");
		}
		System.out.println();
		
		//print in reverse array
		for(int i = (a.length-1); i>=0; i--)
		{
			System.out.print(a[i] + ",");
		}
		
	}

}
