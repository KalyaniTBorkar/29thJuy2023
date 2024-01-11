package mockProgram;

public class Marks extends Students {
 int marks1;
 int marks2;
	public static void main(String[] args) {
		Marks mr=new Marks();
		mr.getMarks();
	}
	public void set()
	{
		marks1=80;
		marks2=90;
		System.out.println("" + marks1);
		System.out.println("my marks2 is "+ marks2);
	}
	public void getMarks()
	{
		set();
	}

}
