package com.jdk.basicprog1;

public class arryDec {
	
      public static void main(String[] args) {
    	  int arr[] = {32,3,54,67,89,65,23,756};
    	  int temp=0;
    	  
    	  // Display by the Original values
          System.out.print("Original values=");
          for(int i=0; i<arr.length; i++)
          {
         	 System.out.print( arr[i]+ " ");
          }
          System.out.println();
          
          // Display by the Decending values
          for(int i=0; i<arr.length; i++)
          {
        	for(int j=i+1; j<arr.length; j++)
        	{
        	  if(arr[i] < arr[j])
        	  {
        	   temp = arr[i];
        	   arr[i] = arr[j];
        	   arr[j] = temp;
        			   
        	}
          }
          System.out.println();
          
          
          System.out.print("Decending order=");
          for(int i1=0; i1<arr.length; i1++)
          {
         	 System.out.print( arr[i1]+ " ");
          }
      }
   }
}
      
          

