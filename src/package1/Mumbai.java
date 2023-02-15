package package1;
public class Mumbai {
	// constructor is use
	public int x ;
     public Mumbai()
     {
   	    x=100;
     }
     Mumbai(int a)
     {
   	     x=200;  
     }
     private Mumbai(char s, int q) 
     {
      	x=300;  
     }
     protected Mumbai(float b)
     {
   	    x=400;
     }
	public static void main(String[] args) {
         Mumbai a= new Mumbai();       //public
         Mumbai b=new Mumbai(23);      //default
         Mumbai c=new Mumbai('d',54);     //private
         Mumbai d=new Mumbai(3.44f);    //protected
         System.out.println(a.x);
         System.out.println(b.x);
         System.out.println(c.x);
         System.out.println(d.x);
	}

}
