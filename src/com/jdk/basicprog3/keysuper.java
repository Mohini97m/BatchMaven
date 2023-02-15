package com.jdk.basicprog3;

public class keysuper extends supersubclass {
	static int a=10;
           int b=20;

     void test() {

    	 System.out.println(a);
	     System.out.println(b);
	     System.out.println(keythis.a);
	     System.out.println(super.a);
	     System.out.println(super.b);
	
	}
// super => used to globale variable of super class
//          when global variable name of super class and 
 //         global variable name are sub class are same
          public static void main(String[] args) {
	      // TODO Auto-generated method stub
         	keysuper x=new keysuper();//
            x.test();

	
	}

}
