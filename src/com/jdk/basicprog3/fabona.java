package com.jdk.basicprog3;

public class fabona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1 1 2 3 5 8
		
		 int a=0;
		 int b=1;
		 int c;
		 int n =10;
		 System.out.print("fabonacci Series = ");
		 
		 System.out.print(a + " ");
		 System.out.print(b + " " );
		 for(int i=1; i<=n; i++)
		 {
			 c=a+b;
			 a=b;    
			 b=c;
			 System.out.print(c + " " );
		 }
	}

}
