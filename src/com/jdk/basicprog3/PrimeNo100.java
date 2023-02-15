package com.jdk.basicprog3;

public class PrimeNo100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for(int i=1;i<=100;i++)
         {
        	int count=0;
        	for(int j=2; j<=i-1; j++)
        	{
        		if(i%j==0)
        		{
        			count=count+1;
        		}
        	}
        	if(count==0)
        	{
        		System.out.print(i + " ");
        	}
        	
	   
   }
	}

}
