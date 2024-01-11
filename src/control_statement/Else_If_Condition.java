package control_statement;

public class Else_If_Condition {
public static void main(String[] args) {
	String country = "INDIA";
	String status = "A1";
	if(country=="INDIA" && status == "A3")
	{
		System.out.println("Entry APPROVE ");
		System.out.println("Allocate the seat in first row");
	}
	else if(country == "INDIA" || status == "A2")
	{
		System.out.println("Ask for Entry Pass AND allocate seat in second row");
	}
	else
	{
		System.out.println("for other country apply the charges according");
	}
}
}
