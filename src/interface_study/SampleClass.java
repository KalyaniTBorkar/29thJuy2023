package interface_study;

public class SampleClass implements Interface_2 {

	public static void main(String[] args) {
		SampleClass sc = new SampleClass();
		sc.test1();
		sc.test2();
		sc.test3();
		sc.test4();
		

	}

	@Override
	public void test3() {
		System.out.println("interface2-method test3");
		
	}

	@Override
	public void test4() {
		System.out.println("interface2-method test4");
		
	}

	@Override
	public void test1() {
		System.out.println("interface1-method test1");
		
	}

	@Override
	public void test2() {
		System.out.println("interface1-method test2");
		
	}

}
