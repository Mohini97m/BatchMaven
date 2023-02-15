package com.jdk.basicprog3;

public class Reverseeachwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "Mohini Magar";
		String b[]= a.split(""); 
		
		String revstring= "";
		
		for(int i=0; i<=b.length; i++)
		{
			String word = b[i];
			System.out.print(word);
            String revword="";
            
           for(int j= word.length()-1; j>=0; j-- )
           {
        	   revword= revword+word.charAt(j);
           }
           rev=rev+revword+"";
		}
		System.out.print("String Reverse=");

	}

}
