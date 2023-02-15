package package1;

public class leapyearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int startyear=2000;
       int lastyear=2010;
       
       for(int i= startyear; i<=lastyear; i++)
       {
    	   if((i%4==0)||(i%400==0) && (i%100!=0))
    	   {
    		   System.out.println( i + " = is leap year");
   		   }
    	   else
    	   {
    		   System.out.println( i + " = not leap year");
    	   }
       }
	}

}
