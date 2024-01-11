package abstarctStudy;

public class Concrete2Class extends AbstractClass {

	public static void main(String[] args) {
		Concrete2Class ccc=new Concrete2Class();
		ccc.address();
		ccc.name();
		emailId();
		country();
	}

	@Override
	public void name() {
		System.out.println("my name is tush-Concrete2Class");
		
	}

	@Override
	public void address() {
		System.out.println("i am frpm pune-Concrete2Class");
		
	}
	public static void emailId() 
	{
		
	System.out.println("tush15@gmail.com-Concrete2Class");
		
	}

}
