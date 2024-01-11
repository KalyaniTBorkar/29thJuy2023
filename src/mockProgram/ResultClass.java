package mockProgram;

public class ResultClass extends Marks {
	int total ;
		
	public static void main(String[] args) {
		ResultClass rc=new ResultClass();
		rc.getResult();
	}
	public void calculate()
	{
		total = marks1+marks2;
		System.out.println("kitty got total marks =" + total);
	}
	public void getResult()
	{
		calculate();
	}

}
