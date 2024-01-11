package loop_study;

public class Post_N_Pre_Increament {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		int i= a++; //a++ means post increment means first assign then increase
		System.out.println(i);
		System.out.println(a);
		System.out.println(a);
		a++;
		System.out.println(a);
		System.out.println("******************");
		int f=100;
		System.out.println(f);
		int j=++f;        //++f means pre increment means first increse then assignment
		System.out.println(j);
		System.out.println(f);
		++f;
		System.out.println(f);
	}

}
