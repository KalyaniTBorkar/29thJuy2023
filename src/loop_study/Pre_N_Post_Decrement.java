package loop_study;

public class Pre_N_Post_Decrement {

	public static void main(String[] args) {
		int k=10;
		System.out.println(k);
		int t=--k;   //pre_decrement-first decrement then assignment
		System.out.println(t);
		System.out.println(k);
		--k;
		System.out.println("**********************");
		 int s= 50;
		 System.out.println(s);
		 int p = s--;
		 System.out.println(p);
		 System.out.println(s);
		 s--;
		 System.out.println(s);
	}

}
