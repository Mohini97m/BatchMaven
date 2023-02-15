package com.jdk.basicprog3;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String a = "Velocity";
	       String b = "VELOC ITY";
	       
	       String c = new String("Velocity ");
	       String d = new String("velocity");
	       
           boolean result = a.equals(c);
	       System.out.println(result);
	       
	       // case sensitive Comparison
	     result = a.equals(d);
	      System.out.println(result);
	      
	      result = a.equals("Velocity");
	       System.out.println(result);
	       
	      // non-case sensitive Comparison
	     result = a.equalsIgnoreCase(d);
	       System.out.println(result);
	       
	       String result1 = a.toUpperCase();
	       System.out.println(result1);
	       
	        String result2 = b.toLowerCase();
	       System.out.println(result2);
	       System.out.println(b);
	       
	       char result3 = a.charAt(3);
	      System.out.println(result3);
	       
	       int size = a.length();
	      System.out.println(size);
	       
	       boolean end = a.endsWith(c);
	       System.out.println(end);
	       
	      String resul = b.trim();
	      System.out.println(resul);
	       
	       int size1= a.hashCode();
	       System.out.println(size1);
	        
	}

}
