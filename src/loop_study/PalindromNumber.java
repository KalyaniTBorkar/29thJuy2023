package loop_study;

public class PalindromNumber {

	public static void main(String[] args) {
		int h=121,r=0;
		int d=h;
		while(h!=0) {
			int j=h%10;
			r=r*10+j;
			h=h/10;	
		}
		System.out.println(r);
		if(d==r) {
			System.out.println("no is pallindrom");
			}
			else {
				System.out.println("no is not pallindrom");	
		}
		}

	}


