package com.jdk.basicprog3;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=321;
        int rem, temp=0;
        int sum=0;
        while(n>0) // 151>0,15>0,1>0,
        {
        	rem=n%10; // rem=151/10=1,15/10=5,1>0,
        	sum=(sum*10)+rem; //sum=1*10+5=15,15*10+1=151,
        	n=n/10;// n=15,1,0
        }
        if(temp==sum) // 0==0
        {
        	System.out.println("Palindrome No ");
        }
        else
        {
        	System.out.println("Not Palindrome No ");
        }
	}

}
