package com.jdk.basicprog1;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=0;
         int b=1;
         int c;
         
         for(int i=1; i<=10; i++)
         {
        	 c=a+b;
        	 a=b;
        	 b=c;
        	 System.out.print("," +  c );
        	 
         }
	}

}
