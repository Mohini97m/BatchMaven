package com.jdk.basicprog3;

public class Armstrong {
	
	public static void main(String[] args) {
		
        int n=103;
		int temp=n;
		int rem;
		int sum=0;
		
		while (n>0) 
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
		if(temp==sum) 
		{
		System.out.println("Armstrong No"+temp);	
		}
		else
		{
			System.out.println("Not Armstrong No"+temp);
		}
	
	}
}

