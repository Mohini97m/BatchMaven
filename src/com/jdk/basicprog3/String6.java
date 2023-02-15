package com.jdk.basicprog3;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String a = "    Velocity class pune class fromclassKatraj";
		   String b = "VELOC ITY";
	       
	       String c = new String("class");
	       String d = new String("velocity");
	       
	       String result = a.replace('s', 'm');
	       System.out.println(result);
	       
	       result = a.replace('s', 'm');
	       System.out.println(result);
	       
	       result = a.replace("class","Mohini");
	       System.out.println(result);
	       
	       result = a.replace('o','A');
	       System.out.println(result);
	       
	       System.out.println(a);
	       String result1[] = a.split("class");
	       for (int i=0; i<result1.length; i++)
	         {
	    	  System.out.println(result1[i]);
	         }
	       
	       String i= a.trim();
	       System.out.println(i);
	      
	      boolean  j=a.endsWith("Vel");
	      System.out.println(j);
	}

}
