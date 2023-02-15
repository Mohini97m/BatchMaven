package com.jdk.basicprog3;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "Pratik";
      String b = "Pratik";
      
      String c=new String ("Pratik");
      String d= new String ("Pratik");
      
      //Address compare
      System.out.println(a);
      System.out.println(b);
      System.out.println(a==b);
      System.out.println("========");
      
      b="Velocity";
      System.out.println(a);
      System.out.println(b);
      System.out.println(a==b);
      System.out.println("========");
      
      
      b="Pratik";
      System.out.println(a);
      System.out.println(b);
      System.out.println(a==b);
      System.out.println("========");
      
	}

}
