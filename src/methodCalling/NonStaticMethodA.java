package methodCalling;

public class NonStaticMethodA {

	public static void main(String[] args) {
		NonStaticMethodA obj1=new NonStaticMethodA();
       obj1.NonSt1();
	}
 public void NonSt1()
 {
	 System.out.println("this is Nonstatic method NonSt1 from same class");
	 
 }
 
}

