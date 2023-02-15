package com.jdk.basicprog3;

public class ReverseNowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=2354;
       int rev=0,rem;
       System.out.print("Reverese No =" );
       while(a!=0)//2354!=0 false
       {
    	   rem=a%10;//4=2354/10=2,234/10=5,23/10=3,2/10=0
    	   rev=rev*10+rem;//rev=0*10+2,
    	   a=a/10;
       }
       System.out.print(rev);
       
	}

}
