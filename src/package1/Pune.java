package package1;

public class Pune {

	public static void main(String[] args) {
		 Mumbai a= new Mumbai();       //public
         Mumbai b=new Mumbai(23);      //default
         Mumbai c=new Mumbai('d',54);  //private
         Mumbai d=new Mumbai(3.44f);   //protected
         System.out.println(a.x);
         System.out.println(b.x);
         System.out.println(c.x);
         System.out.println(d.x);
	}

}
