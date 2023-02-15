package com.jdk.basicprog3;
    // concrete class
public class concrete extends Abstr {
	//override
   	 void demo()
   	 {
   		System.out.println("Demo");
   	 }
   	 //override
	 void test() 
	 {
		 System.out.println("Test");
	 }	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	 abstr x= new abstr();// abstarct method can'i be createrd while object 
		 
		 concrete c=new concrete();
		 c.demo();
		 c.test();
		 c.beta();
		// c.Abstr();
		 c.staticTest();
		 System.out.println(c.a);
		 System.out.println(c.b);
	}

}
