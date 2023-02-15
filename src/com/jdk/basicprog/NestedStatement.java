package com.jdk.basicprog;

public class NestedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=577;
        int b=5;
        int c=7;
        
       System.out.println("Hello");
       if (a>b)
       {
    	  System.out.println("Condition 1");
    	  if (a > c) 
    	  {
    		  System.out.println("Mohini");
    		  if (a < b)
    		  System.out.println("Condition 2");
    	  }
    	  else 
    	  {
    		  System.out.println("Start");
    		  
    	  }
       }
       else
       {
    	   System.out.println("End");
       }
      }
	}


