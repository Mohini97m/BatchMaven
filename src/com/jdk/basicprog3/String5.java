package com.jdk.basicprog3;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String a = "Velocity";
	       String b = "VELOC ITY";
	       
	       String c = new String("class");
	       String d = new String("velocity");
	       
	      String result= a.concat("Batch");
	      System.out.println(result); //upend
	      
	      result= a.concat(c);
	      System.out.println(result); //upend
	      
	       result= a + "pune";
	      System.out.println(result); //upend

	      result=  "pune" +  a ;
	      System.out.println(result); //upend
	      
	      result= "Class" + a + "pune" ;
	      System.out.println(result); //upend
	      

	}

}
