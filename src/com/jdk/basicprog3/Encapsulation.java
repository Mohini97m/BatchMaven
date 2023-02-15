package com.jdk.basicprog3;

public class Encapsulation {
    private static  int a=10;
    private static int b=20;
    private int c=30;
    private int d=40;
    
    public Encapsulation(int x){
    	a=100;
    	b=200;
    	c=300;
    	d=400;
    }
    
    public Encapsulation()
    {
    	a=1000;
    	b=4000;
    	c=3000;
    	d=4000;
    }
    public  int add() {
    
    	int sum1 =c+d;
    	return sum1;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println(Encapsulation.a);
	}

}
