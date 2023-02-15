package pakage3;
  //overiding, run time Polymorphism
public class Samiksha extends Nikhil {
	
	static void demo()
	  {
		  System.out.println("Hiii");
	  }
			  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Samiksha d=new Samiksha();
        //d.demo();
         
        Nikhil.demo();
        Samiksha.demo();
       
        // x.demo(44);
         //x.demo();
         //x.demo(55);
	}

}
