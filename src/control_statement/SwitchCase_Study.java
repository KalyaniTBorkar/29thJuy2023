package control_statement;

public class SwitchCase_Study {

	public static void main(String[] args) {
		String signal= "RED";
		switch (signal) 
		{
		case "RED":System.out.println("stop the vehical");
		break;
		case "YELLOW":System.out.println("Go Slow");
		break;
		case "GREEN":System.out.println("vehical allow to go");
		break;
		//default:System.out.println("give the correct key value");
		//break;
		}
	}

}
