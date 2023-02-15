package com.jdk.basicprog3;

public class ReversrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String n = "Mohini";
        String rev=" ";
        int leng= n.length();
        
        System.out.print("Reverse String = ");
           //   i= i-1,i>=0
           //   i=n-1, 
        for(int i=leng-1; i>=0; i--)
        {
        	rev=rev+n.charAt(i);//rev=""+i,
        }
        System.out.print(rev);
	}

}
