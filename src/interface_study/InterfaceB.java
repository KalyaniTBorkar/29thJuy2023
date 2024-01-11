package interface_study;

public interface InterfaceB {
	void testB1();
	 void testB2();
	 default void testA3()
	 {
		 System.out.println("testA3 from InterfaceB");
	 }
}
