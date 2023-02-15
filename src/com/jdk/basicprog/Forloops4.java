package com.jdk.basicprog;

public class Forloops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int a=1; a<=8; a++)
		 {
			 for(int b=8-1; b>=a; b--)
			     {
				   System.out.print(" "); 
			     }
				 for(int c=1;c<=a;c++)
				 {
					  System.out.print("* ");
			     }
			         System.out.println();
			 }
		 }

}


