package com.jdk.basicprog3;

public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="Mohini Magar";
        String b="Lambani";
        
        String i= a.substring(7);
        System.out.println(i);
	     
        String [] result=a.split("Mohini");
        for(int j=0; j<result.length; j++)
        {
        	System.out.println(result[j]);
        }
       String k= b.replace('L', 'A');
       System.out.println(k); 
       
        k= a.replace("Mohini", "Samiksha");
       System.out.println(k); 
       
	}

}
