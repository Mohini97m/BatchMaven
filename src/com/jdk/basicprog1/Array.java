package com.jdk.basicprog1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Declaration & Initialization
		
		int a[]= {12,23,43,54,76,87}; //size=6 , Index = 0 to 5
		
		char b[]= {'@','&','K'};     // Size=3 , Index = 0 to 2
		 
		//Declaration
		int c[]= new int[3];        //Size=3 , Index = 0 to 2
		String d[]=new String[2];  //Size=2  , Index = 0 to 1
	     
		c[0]=23;
		c[1]=34;
		c[2]=27;
		
		 
		d[0]="Velocity";
		d[1]="class";
		
		int x = a[0]+a[3];
		System.out.println(c[2]);
		System.out.println(x);
		System.out.println(d[0]);
		
				
	}

}
