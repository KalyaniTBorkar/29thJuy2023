package interface_study;

public interface InterfaceA {
 void testA1();
 void testA2();
 default void testA3()
 {
	 System.out.println("testA3 from InterfaceA");
 }
 
 
}
