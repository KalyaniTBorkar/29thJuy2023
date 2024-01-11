package constructor;

public class Constrct1 {
	
	public static void main(String[] args) {
		
		Constrct1 ob = new Constrct1();
		ob.add();
		Constrct1 ob1= new Constrct1(40, 50, 60);
		ob1.add();
	}
int a ;
int b;
int c;

public Constrct1 ()
{
  a=10;
  b=20;
  c=30;
}
	
public void add()
{
	int sum = a+b+c;
	System.out.println("sum is "+sum);
}
public Constrct1 (int X,int Y,int Z)	
{
	a = X;
	b=Y;
	c=Z;
	
	}

}


