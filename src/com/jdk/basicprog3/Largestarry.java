package com.jdk.basicprog3;

public class Largestarry {

//	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		//Largest Number 
      /*  int a[]= {2,3,15,543,765};
        int max=a[0]; // 2,3,15,543,765
        
         System.out.print("Largest No=");
         
        for(int i=0; i<a.length;i++)
        {
        	if(max<a[i])
        	{
        	 max=a[i];	
        	}
        }
        System.out.println(max);
	}

}*/ 
 // 2nd largest number		
/*int a[]= {2,3,15,543,765};
int temp; // 2,3,15,543,765
 
for(int i=0; i<a.length;i++)
{
	for(int j=i+1; j <a.length; j++) 
	{
		
	if(a[i]<a[j])
	{
	 temp=a[i];
	 a[i]=a[j];
	 a[j]=temp;
	}
	}
}
System.out.println("second largest no=" +a[1]);
}
}*/
		private static int third(int[] a, int total) {
			// TODO Auto-generated method stub
			

int temp = 0; // 2,3,15,543,765
 
int total1 = 0;

for(int i1=0; i1<total;i1++)
{
	for(int j=i1+1; j <total; j++) 
	{
		
	if(a[i1]<a[j])
	{
	 temp=a[i1];
	 a[i1]=a[j];
	 a[j]=temp;
	}
	}
}
  return a[total-3];

	}
		public static void  main(String[] args) {
			int a1[]= {2,3,15,543,765};	
			System.out.print(" Third Largest No=" + third(a1,5));	
		}
	
}













