package com.jdk.basicprog;

public class forloops6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int line=6;
       for(int a=line; a>=1; a--)
       {
    	   for(int b=line-1; b>=a; b--)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int c=1; c<=a; c++)
    	   {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
           }
	     }
      }


