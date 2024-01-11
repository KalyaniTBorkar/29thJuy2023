package abstarctStudy;

public abstract class ConcreteClass extends AbstractClass {

	public static void main(String[] args) {
		/*ConcreteClass cc = new ConcreteClass ();
			cc.name();
			cc.address();
			cc.email();
			ConcreteClass.country();
			ConcreteClass.collage();*/

	}
	public void email ()
	{
		System.out.println("email-kitty15@gmail.com");
	}
	public static void collage()
	{
		System.out.println("J. m. patel collage");
	}
	

	@Override
	public void name() {
		System.out.println("my name is kitty");
		
	}

	@Override
	public void address() {
		System.out.println("i am belongs to Pune");
		
	}
	 public abstract void Age();

}
