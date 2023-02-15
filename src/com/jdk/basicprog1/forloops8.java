package com.jdk.basicprog1;

public class forloops8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int a=1; a<=6; a++)
       {
    	   for(int b=1; b<=a; b++)
    	   {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
           }
           
	      for(int a=6; a>=1; a--)
	      {
	    	  for(int b=1; b<a; b++)
	    	  {
	    		  System.out.print("* ");
	    	  }
	    	  System.out.println();
	      }
       }
	}


