package com.jdk.basicprog3;

public class DuplicateArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] array = {"Mohini", "Samiksha", "Mohini", "Nikhil", "Samiksha", "Pranita", "Pranita"};
		 
	        for (int i = 0; i < array.length-1; i++)
	        {
	            for (int j = i+1; j < array.length; j++)
	            {
	                if( (array[i].equals(array[j])) && (i != j) )
	                {
	                    System.out.println("Duplicate String is : "+ array[j]);
	                }
	            }
	        }
	    }    
	}
	


