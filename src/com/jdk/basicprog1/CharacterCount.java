package com.jdk.basicprog1;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s ="Mohini Magar";
   System.out.println("String = " + s);
   
   int count = 0;
   for(int i =0;i<=s.length();i++)
   {
	   count++;
   }
   System.out.println("Character Count including space = "+ count);
	}

}
