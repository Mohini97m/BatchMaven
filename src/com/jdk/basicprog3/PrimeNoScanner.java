package com.jdk.basicprog3;

import java.util.Scanner;

public class  PrimeNoScanner {

	public static void main(String[] args) {
		 int n,count=0;
		 System.out.println("Enter any Number :");
         Scanner s = new Scanner(System.in);
         n = s.nextInt();
         for (int i=1; i<=n; i++)
         {
        	 if(n%i==0)
        	 {
        		 ++count;
        	 }
         }
        	 
         if(count==2)
         {
        	 System.out.println("Prime No ");
         }
         else 
         {
        	 System.out.println("Not Prime NO");
         }
         }
	}
	

         
         
         
         
         

