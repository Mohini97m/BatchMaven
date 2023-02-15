package com.jdk.basicprog1;

public class forloops9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int a=0; a<=6; a++)
       {
    	   for(int b=6; b>=a; b--)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int c=1; c<=a; c++)
    	   {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
          }
          for(int a=5; a>=1; a--)
          {
        	  for(int b=6; b>=a; b--)
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
