package constructor;

public class Parent {

	Parent()
	{
		System.out.println("default parent");
	}
	Parent(int a)
	{ this();
		System.out.println("parent one parameter "+ a);
		
	}
	
}
