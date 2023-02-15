package pakage2;

public class priya extends pratik {

	public static void main(String[] args) {
		
        System.out.println(pratik.a); //private
        System.out.println(pratik.c);//protected
        System.out.println(pratik.b);//Default
        
        pratik x=new pratik();
        System.out.println(x.d);// non-static
	}

}
