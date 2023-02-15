package package1;
//sbi
public class class1 implements abstractions {

  public void withdrow()
	{
		System.out.println("withdrow1");
	}
	
  public void balInq() 
    {
		System.out.println("BalInq1");
	}
	
  public	void MiniStatement() 
   {
	  System.out.println("Mini Statement1");
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        class1 x=new class1();
        x.withdrow();
        x.balInq();
        x.MiniStatement();
        System.out.println(class1.a);
        System.out.println(abstractions.a);
	}

}
