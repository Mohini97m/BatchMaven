package package1;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {10,20,30,40};
        int temp=0; 
        
     //   for(int i=a.length-1; i>=0; i--)
       // {
        //	System.out.print(a[i]+ ",");
       // }
        for(int i=0; i<=a.length; i++)
        {
        	for(int j=i+1; j<=a.length; j++ )
        	{
        		if(a[i]>a[j])
        		{
        			
        	  temp=a[i];
        	  a[i]=a[j];
        	  a[j]=temp;
        	}
        	}
        		System.out.println();
        
        	
        }
        
        
        
	}
	}

