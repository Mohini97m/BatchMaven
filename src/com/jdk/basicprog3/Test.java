package com.jdk.basicprog3;

public class Test{
	static int a=10;
	       int b=20;
	       
	 void test()
	 {
		 System.out.println(a);
		 System.out.println(b);
	 }
	
	
	public static void main(String[] args) {
		 
         Test x=new Test();//x.test();  x.b=20
         Test y=new Test();//y.test();  y.b=20
         
         x.test();
         
         x.b=100;
         y.b=200;
         
         x.test();//b=200
         y.test();//b=200
	}
}