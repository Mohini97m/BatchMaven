package com.jdk.basicprog3;

public class Constructor {
       
	static int a=10;
	       int b=20;
	 Constructor () 
	      {
	    	  a=23;
	    	  b=45;
	     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Constructor.a);
        //Constructor call
        //1.object create
        //2.non-static 
        Constructor x=new Constructor();
        //variable call
        System.out.println(x.a);
        //constructor call
        System.out.println(Constructor.a);
        System.out.println(x.b);
        
	}

}
