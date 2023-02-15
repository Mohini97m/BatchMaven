package com.jdk.basicprog1;

public class StringToCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			String s="hello";  
			//returns h 
			for(int i=0; i<s.length();i++)
			{  
		        char c = s.charAt(i);  
		        System.out.println("char at "+i+" index is: "+c);  
			
			}  
	}
}


