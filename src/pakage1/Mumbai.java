package pakage1;

public class Mumbai {

	// Methods is use
      public static  int a=10;
             static int b=20;
      private static int c=30;
      protected static int d=40;
      
      public void test()
      {
    	System.out.println("public");  
      }
      void test1()
      {
    	  System.out.println("Default");
      }
      private void test2()
      {
    	  System.out.println("private");
      }
      protected void test3() 
      {
    	  System.out.println("protected");
      }
    	  
      public static void main(String[] args) 
      {
    	 
    	  Mumbai x =new Mumbai();
		System.out.println(x.a);//public 
		System.out.println(x.b);//default
		System.out.println(x.c);//private
		System.out.println(x.d);//protected
		
	}
	}


