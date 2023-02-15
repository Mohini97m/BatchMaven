package com.jdk.basicprog1;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,23,43,54,56}; //9=>36 byte
		// print from index 0 to last index
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] +",");
		}
		 
		 // Reverse the array
		
		int b[]  = new int[a.length];
		b[0]=a[4];
	    b[1]=a[3];
	    b[2]=a[2];
	    b[3]=a[1];	
	    b[4]=a[0];
	    		
	    a[0]=b[0];
	    a[1]=b[1];
	    a[2]=b[2];
	    a[3]=b[3];
	    a[4]=b[4];
	    
	    System.out.println();
	    //print from index 0 to last Index
	    for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] +",");
		}
	    int b[]=a[(a.length-1)+i];
	}
}   





