package com.jdk.basicprog3;

public abstract class Abstr {
            int a=4;
     static int b=67;
     
     Abstr(){
    	 int a=87;
    	 int b=6;
    	  }
     
     abstract void demo(); //Non-static
	 abstract void test();
	 
	 void beta()
	 {
		 System.out.println("Beta");
	 }
	  static void staticTest()
	  {
		  System.out.println("Static abstract ");
	  }
     
    	 
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  abstr x= new abstr();
      // x.demo();
      //abstract method can'y be declared while creating the object
	}

}
