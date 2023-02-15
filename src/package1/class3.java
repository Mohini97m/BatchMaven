package package1;
//hdfc
public class class3 implements abstractions{
	public 	void withdrow()
	{
		System.out.println("withdrow3");
	}
	
  public	void balInq() 
    {
		System.out.println("BalInq3");
	}
	
  public	void MiniStatement() 
   {
	  System.out.println("Mini Statement3");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class3 z=new class3();
		z.withdrow();
		z.balInq();
		z.MiniStatement();
		System.out.println(class3.a);
		System.out.println(class2.a);
		System.out.println(abstractions.a);
	}

}
