package pakage4;

public class Mohi {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Naredra";
		String b= "Modi";
		
		char x= a.charAt(0);
		System.out.print(x);
	     x= a.charAt(6);
		System.out.print(x);
	     x= a.charAt(8);
	     System.out.print(" ");
		System.out.print(x);
		 x= a.charAt(11);
	System.out.print(x);
		
		System.out.println();
		
		String result[] = a.split("aredr");
		for(int i=0; i<result.length; i++)
		{
			System.out.print(result[i]);
					
		}
		System.out.print(" ");
		
		String result1[]=b.split("od");
		for(int i=0; i<result1.length; i++)
		{
			System.out.print(result1[i]);
					
		}
	
	}
}
	


