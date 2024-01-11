package mockProgram;

public class ClassA {

	public static void main( String [] args)
	{
		M1();
		ClassA AA = new ClassA();
		//AA.M2();
		AA.M3();
		ClassB.m4();
		ClassB.m5();
		ClassB BB = new ClassB();
		BB.m6();
		ClassC.m7();
		ClassC.m8();
		ClassC CC = new ClassC();
		CC.m9();
	}
 public static void M1 () {
	 System.out.println("static from classA");
 }
 public void M2 ()
 {
	 System.out.println("nonstatic from classA");
 }
 public void M3 ()
 {
	 System.out.println("nonstatic from classA");
 }
}
