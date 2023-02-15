package com.jdk.basicprog3;

public class casting {
	public static void main(String[] args) {
		//Implicite casting
		int a=23;
		long b;
		
		b=a;
		System.out.println(b);
		System.out.println(a);
		//Exceplicite casting
		long c=34;
		int d;
		
		d=(int)c;
		System.out.println(c);
		System.out.println(d);
		
		short e=40;
		byte f;
		
		f=(byte)e;
		System.out.println(e);
		System.out.println(f);
		
		double g=50;
		int h;
		
		h=(int)g;
		System.out.println(g);
		System.out.println(h);
	}

}
