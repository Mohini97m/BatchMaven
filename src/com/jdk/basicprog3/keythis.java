package com.jdk.basicprog3;

public class keythis {
	static int a=10;
	       int b=20;
	
	void test() {
		int a=30;
		int b=40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(keythis.a);
		System.out.println(this.a);
		System.out.println(this.b);
		
		
	}
    // this=> used to globale variable of same class
	//      when global variable name and local variable name are same
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keythis x=new keythis();//x.test();  x.b=20
        keythis y=new keythis();//y.test();  y.b=20
        
        x.test();
        
        x.b=100;
        y.b=200;
        
        x.test();//b=200
        y.test();//b=200
	}

}
