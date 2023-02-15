package com.jdk.basicprog1;

public class Forloops10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=5;
       for (int a=temp-1; a>=0; a--)
       {
    	   for(int b=a; b>=0; b--)
    	   {
    	      System.out.print("*");
           }
    	   
    	      System.out.println();
	       }
       for (int a=0; a<=temp-1; a++)
       {
    	   for(int b=a; b>=0; b--)
    	   {
    	      System.out.print("*");
           }
    	  
    	      System.out.println();
	       }
	}
}
