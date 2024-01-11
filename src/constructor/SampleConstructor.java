package constructor;

public class SampleConstructor {
     String date;
     int sold;
     char wing;
     float profit ;
	public static void main(String[] args) {
		SampleConstructor V = new SampleConstructor ();
		V.currentData();
	}
   
	public SampleConstructor ()
	{
		date = "28-08-2023";
		sold = 10 ;
		wing = 'E';
		profit = 76.85f;	
	}
	public void currentData ()
	{
		System.out.println("flat sell on "+ date);
		System.out.print("sold count "+ sold);
		System.out.println(" from the wing "+ wing);
		System.out.println("overall profit generated today "+ profit + " %");
	}
}
