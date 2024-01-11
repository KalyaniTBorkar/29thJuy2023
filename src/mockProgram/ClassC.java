package mockProgram;

import methodCalling.MethodWithParameters;

public class ClassC extends MethodWithParameters {
 
	public static void main (String [] args)
	{
		ClassC cc = new ClassC(); //subclass object
		MethodWithParameters mp = new MethodWithParameters(); // super class object
		cc.A();
		//mp.A - private method from diffrent package we can not call with super call object.
	}
	public static void m7()
	{
		 System.out.println("static from classC");
	 }
	 public static void m8()
	 {
		 System.out.println("static from classC");
	 }
	 public void m9()
	 {
		 System.out.println("nonstatic from classC");
	 }
	
}
