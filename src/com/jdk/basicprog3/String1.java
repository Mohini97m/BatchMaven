package com.jdk.basicprog3;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String a = "Velocity";
	       String b = "Velocity";
	       
	       String c = new String ("Velocity");
	       String d = new String ("Velocity");
	       
	       boolean result = a.equals(c);
	       System.out.println(result);
	       
            result = a.equals(b);
	       System.out.println(result);
	       
	       result = a.equals(d);
	       System.out.println(result);
	       
	       result = b.equals(c);
	       System.out.println(result);
	       
	       result = d.equals(c);
	       System.out.println(result);
	}

}
