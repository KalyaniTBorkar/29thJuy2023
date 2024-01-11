package methodCalling;

public class AllMethod {

	public static void main(String[] args) 
	{   AllMethod ns = new AllMethod ();
		a1();
		ns.a2();
		a3("23-08-2023", 70);
		ns.a4("ETL234D","kitty15@gmail.com");
		
	}
	
	public static void a1()
	{
		System.out.println("method  a1 static without parameter");
		int creditedAmt= 61000;
		int debitedAmt = 15000;
		int remainBlnc= creditedAmt - debitedAmt ;
		System.out.println("remaining accout balance is "+remainBlnc);
		System.out.println("********************************************");
	}
  public void a2 ()
  { 
	  System.out.println("method  a2 is nonstatic without parameter ");
	  System.out.println("*****************************************");
  }
  
  public static void a3( String date , int count )
  {
	 System.out.println("todays date is "+ date); 
	 System.out.println("count for the day "+ count);
	  System.out.println("*****************************************");
	 
  }
  public void a4( String PanCard , String Email   )
  {
	  System.out.println("pan card number is "+ PanCard);
	  System.out.println("Email address "+ Email);
  }
  
}