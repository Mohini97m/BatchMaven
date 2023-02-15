package package5;

public class Mock{
	
	public static void main(String[] args) {
		
		 String n = "I AM A AUTOMATION TESTER";
	        String rev=" ";
	        int leng= n.length();
	        
	        System.out.print("Reverse String = " );
	           
	        for(int i=leng-1; i>=0; i--)
	        {
	        	rev=rev+n.charAt(i);
	        }
	        System.out.print(rev);
	        
	}
}
	
