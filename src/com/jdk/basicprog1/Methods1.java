package com.jdk.basicprog1;

public class Methods1 {
	static int a=200; //Ststic variable
	int x=100;        //non-static variable
	
	//user define
	 static void add()
	 {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	 }
      // System define
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//static
		System.out.println(a);
		//non-static
		Methods1 w=new Methods1();
		System.out.println(w.a);
		System.out.println(w.x);
		System.out.println("=====");
		
		w.a=300;
		System.out.println(w.a);
		//use define
		System.out.print("user define");
	    add();
				
		
		
	}

}
