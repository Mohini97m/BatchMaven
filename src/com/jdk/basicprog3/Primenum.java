package com.jdk.basicprog3;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;  // 1-7    2 to 6 , 2,3,4,5,6
		int count=0;
		 for (int i=1; i<=n; i++)
         {
        	 if(n%i==0)
        	 {
        		 ++count;
        	 }
         }
        	 
         if(count==2)
         {
        	 System.out.println("Prime No=" + n);
         }
         else 
         {
        	 System.out.println("Not Prime="+ n);
         }
	    }
      }
	
     
   
      

	


