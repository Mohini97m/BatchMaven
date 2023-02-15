package com.jdk.basicprog;

public class largest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=2,b=6,c=50,d=8,f=10;
        if(a>b && a>c && a>d && a>f)
        {
        	System.out.println("a is largest");
        }
        else if(b>a && b>c && b>d && b>f)
        {
        	System.out.println("b is largest");
        }
        else if(c>a && c>b && c>d && c>f)
        {
        	System.out.println("c is largest");
        }
        else if(d>a && d>b && d>c && d>f)
        {
        	System.out.println("d is largest");
        }
        else 
        {
        	System.out.println("f is largest");
        }
        
	}

}
