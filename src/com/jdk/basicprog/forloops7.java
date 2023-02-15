package com.jdk.basicprog;

public class forloops7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int line=5;
     for(int a=1; a<=line; a++)
     {
    	 for(int b=line; b>=a; b--)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int c=1; c<=(a*2)-1; c++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
	}

}
