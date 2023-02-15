package com.jdk.basicprog;

public class Demo34 {
    public static void main(String[] args) {
    	int a=5;
    	int b=2;
    	int c;
    	float d;
    	//Arithmetic Operator
    	c = a+b ;
    	System.out.println(c);
    	c = a-b;
    	System.out.println(c);
    	c = a * b;
    	System.out.println(c);
    	c = a / b;
    	System.out.println(c);
        c = a % b;
        System.out.println(c);
        d = a%b;
        System.out.println(d);
         c = a++;
         System.out.println(c);
         c = ++a;
         System.out.println(c);
         c = b--;
         System.out.println(c);
         c = --b;
         System.out.println(c);
         
         //relational Operator 
         boolean x = true ;
                 x = false;
         
         x = a>b;
         System.out.println(x);
         x = a<b;
         System.out.println(x);
         x = a>=b;
         System.out.println(x);
         x = a<=b;
         System.out.println(x);
         x = a==b;
         System.out.println(x);
         x = a!=b;
         System.out.println(x);
         
         // Logical Operator
        boolean f = true;
       	boolean h = false;
     	
        boolean k =h&&f;  
        System.out.println(k);
        k = f||h;
        System.out.println(k);
    	k = f!=h;
    	System.out.println(k);
    	
    	// assignment Operator
    	c = a=b;
    	System.out.println(c);
    	
    	
    
    }
}
