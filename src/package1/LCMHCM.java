package package1;

public class LCMHCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int HCF = 0;
      int n1=12;
      int n2=16;
      int LCM=0;
      for(int i=1; i<=n1 || i<=n2; i++)
      {
    	  if(n1%i==0 && n2%i==0)
    	  HCF=i;
      }
      LCM=(n1*n2)/HCF;
      System.out.println("HCF is number ="+ HCF);
      System.out.println("LCM is number ="+ LCM);
      
	}

}
