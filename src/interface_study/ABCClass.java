package interface_study;

public class ABCClass implements InterfaceA,InterfaceB,InterfaceC {

	public static void main(String[] args) {
		ABCClass abc=new ABCClass();
		abc.testA1();
		abc.testA2();
		abc.testB1();
		abc.testB2();
		abc.testC1();
		abc.testC2();
		abc.testA3();
		InterfaceC.testA3();
		abc.abcc();
}

	@Override
	public void testC1() {
		System.out.println("testC1 method form interfaceC");
		
	}

	@Override
	public void testC2() {
		System.out.println("testC2 method form interfaceC");
		
	}

	@Override
	public void testB1() {
		System.out.println("testB1 method form interfaceB");
		
	}

	@Override
	public void testB2() {
		System.out.println("testB2 method form interfaceB");
		
	}

	@Override
	public void testA1() {
		System.out.println("testA1 method form interfaceA");
	}

	@Override
	public void testA2() {
		System.out.println("testA2 method form interfaceA");
		
	}

	@Override
	public void testA3() {
		
		InterfaceA.super.testA3();
		InterfaceB.super.testA3();
	}
	public void abcc()
	{
		System.out.println("abcc method from ABCClass");
	}
}
