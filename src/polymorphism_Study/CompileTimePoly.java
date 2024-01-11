package polymorphism_Study;

public class CompileTimePoly {

	public static void main(String[] args) {
		System.out.println("one method can be many form=polymorphism");
		System.out.println("-It is a feature of opps that allows us to perform a single action in a diffrent ways");
		System.out.println("-using polymorphism we can acchiev the portability");
		System.out.println("-method declaration part and defination part get bind at the time of compilation on the basisi  of privided argument call compile timr polymorphism");
		System.out.println("-The binding get done at the time of compilation called early binding");
		System.out.println("-Once the binding is done the re-binding is not possible calles static binding");
		System.out.println("-In a same class when two or more than two methods have same name having diffrent argument call method overloading ");
		CompileTimePoly cp=new CompileTimePoly();
		cp.calculation();
		cp.calculation(100, 200);           //declariotn of method in heap area
		cp.calculation(20, 30, 10);
	}
  public void calculation()
  {
	  int a=30;
	  int b=60;                          //defination part in method area
	  int sum=a+b;
	  System.out.println("sum is "+sum);
  }
  public void calculation(int c,int d)
  {
	  
	  int sum=c+d;
	  System.out.println("sum is "+sum);
  }
  public void calculation(int c,int d,int e)
  {
	  
	  int sum=c+d-e;
	  System.out.println("sum is "+sum);
  }
  
}
