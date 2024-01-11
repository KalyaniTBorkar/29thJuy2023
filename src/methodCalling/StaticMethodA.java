package methodCalling;

public class StaticMethodA {
 static String s ;
	public static void main(String[] args) {
		StaticMethodA.Static1();
		System.out.println(s);
     /*Static1();
     Static2();
     System.out.println("                                                                       ");
     System.out.println("'*To call method from diffrent class use className.MethodName*'");
     StaticMethodB.St1();
     StaticMethodB.St2();
     System.out.println("                                                                       ");
     System.out.println("'*To call NonStatic Method we need to create an object for that class*'"); */
     NonStaticMethodA obj1=new NonStaticMethodA(); //object created 
      obj1.NonSt1(); //nonstatic method calling
      
	}
	
	public static void Static1 ()
	{
		System.out.println("'*to call static method in same class write only method name in main method*'");
		System.out.println("this is static1 method in same class");
		
		
	}
	public static void Static2 ()
	{
		System.out.println("static2 method from same class");
	}
	 public void NonSt1()
	 {
		 System.out.println("this is Nonstatic method NonSt1 from same class");
		 
	 }
}
