package com.jdk.basicprog3;

public class RevereForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=24343;
    int rev = 0;
    int rem=0;
    for(;a!=0;a=a/10)
    {
    	   rem=a%10;
   	        rev=rev*10+rem;
    }
    System.out.println(rev);
	}

}
