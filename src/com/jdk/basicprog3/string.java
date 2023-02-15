package com.jdk.basicprog3;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a = "Velocity";// constant pool area 
       String b = "Velocity";//constant pool area 
       
       String c = new String ("Velocity");//Non-constant pool area
       String d = new String ("Velocity");//Non-constant pool area 
       
       //address Compare
       System.out.println(a == b);//Constant pool area
       System.out.println(c == b);//Non-Constant pool area
       
       System.out.println(a == c);
       System.out.println(a == d);
       
       System.out.println(b == c);
       System.out.println(b == d);
	}

}
