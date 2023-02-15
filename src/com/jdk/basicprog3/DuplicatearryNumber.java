package com.jdk.basicprog3;

public class DuplicatearryNumber {
	public static void main(String[] args) {
		
		int a[]= {1,2,2,1,4,4,5,};
	
		System.out.print("Duplicate Number =");
		for(int i=0; i<a.length; i++)
		{
		  for(int j=i+1; j<a.length; j++ )
		  {
			  if(a[i]==a[j] && (i!=j))
			  {
				  System.out.print(a[i] + " ");
			  }
		  }
		}
	}

}

		 