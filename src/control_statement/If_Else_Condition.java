package control_statement;

public class If_Else_Condition {
	public static void main(String[] args) {
		int count = 900 ;
		String result = "pass";
		float score = 80.85f;
		if (count >= 500 && count <=1000)
		{
			System.out.println("pass the order");
		}
		else
		{
			System.out.println("return the order");
		}
		
		if(result == "pass" && score >=70)
		{
			System.out.println("accept the form");
		}
		else
		{
			System.out.println("reject the form");
		}
	}

}
