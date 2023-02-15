package com.jdk.basicprog3;
import java.util.Scanner;
public class Scanner1 {

	

	public static void main(String[] args) {
		
	      Scanner s = new Scanner(System.in); 
		{
			System.out.println("Enter your Name :");
			   String name=s.next();
			   System.out.println("Enter your Age :");
			   int age=s.nextInt();
			   System.out.println("Enter your Gender :");
			   char geneder=s.next().charAt(0);
			   System.out.println("Enter your Phone No :");
			   long phno=s.nextLong(0);
			   System.out.println("----------");
			   System.out.println("Name :" +name );
			   System.out.println("Age :" + age);
			   System.out.println("Gender :" + geneder);
			   System.out.println("Phone NO :" + phno);
		}
	}
	}


