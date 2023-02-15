package com.jdk.basicprog3;

public class Priya {
	static int a=10;
    int b=20;
    
	public static void main(String[] args) {
		System.out.println(Priya.a);
        
		Priya x = new Priya();
		Priya y = new Priya();
		System.out.println(x.b);
		System.out.println(y.b);
		
	    x.b=30;
	    System.out.println(x.b);
	    System.out.println(y.b);
	    
	    y.a=40;
	    System.out.println(x.a);
	    System.out.println(y.b);
               
	}

}
