package constructor;

public class Constructoe_Chaining {

	public static void main(String[] args) {
		Constructoe_Chaining cn = new Constructoe_Chaining();
		Constructoe_Chaining cn1 = new Constructoe_Chaining(3,3);
		

	}
	Constructoe_Chaining()
	{
		this (2);
		System.out.println("default con");
	}

	
	Constructoe_Chaining( int x)
	{
		this(7,7);
		System.out.println("one parameter");
		System.out.println(x);
		
	}
	Constructoe_Chaining(int y , int z)
	{
		System.out.println("two parameter");
		System.out.println(y*z);
	}
}
