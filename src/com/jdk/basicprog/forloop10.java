package com.jdk.basicprog;



public class forloop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for(int a=1; a<=9; a++)
        {
        	for(int b=1; b<=a; b++)
        	{
        	  if(a==1 || a==9 || b==1 || b==a) 
        	  {
        		  System.out.print("*");
        	  }
        	  else
        	  {
        		  System.out.print(" ");
        	  }
        		
        	}
         System.out.println();
        }
	}

}
