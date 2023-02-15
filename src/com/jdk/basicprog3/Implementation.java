package com.jdk.basicprog3;
  //Implementation class
public class Implementation implements Interface {
	
	
	public void test()//Non-staticImplementation
	{
		System.out.println("Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation c=new Implementation();
		c.test();
		System.out.println(Implementation.a);
		System.out.println(Interface.a);
	}

}
