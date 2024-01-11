package inheritance;

public class Super_Class extends This_Keyword {
	String name = "superkitty";
	private Object m;
	int k=55; 
public static void main(String[] args) {
	Super_Class sk = new Super_Class();
	sk.nssuper();
	int tt =treturn();
	System.out.println(tt);
	
     
}
	public void nssuper ()
	
	{  
		
		 int k=10;
		String name= "superTush";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(k);
		System.out.println(this.k);
	}
	public static int treturn ()
	{ int a= 2;
	 int b= 4;
	 int sum = a+b;
	 System.out.println(sum);
	 
		return b;
	}
}
