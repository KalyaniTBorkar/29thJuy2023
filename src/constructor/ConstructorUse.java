package constructor;

public class ConstructorUse {
	
	public static void main(String[] args) 
	{
		ConstructorUse CS =new ConstructorUse();
		CS.calculation1();
		CS.calculation2();
		ConstructorUse CS1 = new ConstructorUse(100, 99);
		CS1.calculation1();
		CS1.calculation2();
		ConstructorUse CS3 = new ConstructorUse(55, 90, 20);
		CS3.calculation1();
		CS3.calculation2();
	}
     int days;   //declare the variable at class level
     int rs;
     int borrow;
	public ConstructorUse() {
		days = 99;    //initialize the variable inside the constructor
		rs = 180000;
		borrow = 23000;
	}
	
public void calculation1 ()
   {
	int result = rs - borrow ;
	System.out.println(days +" days Calculation is " + result); 
	

	}
public void calculation2()
{
	int result1 = rs + borrow ;
	System.out.println(days +" days Calculation is " + result1);
}

public ConstructorUse(int s1,int s3) 
{
	rs = s1;
	borrow = s3;
}

public ConstructorUse(int s1,int s3 , int s2) 
{
	rs = s1;
	borrow = s3;
	days = s2;
}

}