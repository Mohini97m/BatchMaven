package com.jdk.basicprog;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 4;
        int b = 1;
        int c = 2;
        int d = 3;
		if(a>b)
		{
			if (a>c)
			{
				if (a>d)
				{
					System.out.println("a is largest");
				}
				else
				{
					System.out.println("d is largest");
				}
			}
			else 
			{
				if(c>d)
				{
					System.out.println("c is largest");
				}
				else
				{
					System.out.println("d is largest");
				}
			  }
		   }
		    else 
		     {
				if(b>c)
				{
					if(b>d)
					{
						System.out.println("b is largest");
					}
					else
					{
						System.out.println("d is largest");
					}
				}
				else 
				{
					if (c>d)
					{
						System.out.println("c is largest");
					}
					else
					{
						System.out.println("d is largest");
					}
			    }
			 }
	      }
       }
	       
      
	      
	
	       
		
			
		