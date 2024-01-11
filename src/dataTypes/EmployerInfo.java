package dataTypes;

public class EmployerInfo {

	public static void main(String[] args) {
		//declaration ans initilization.
		String EmpName = "Kitty B" ; 
		int EmpId  = 2161064;
		String PAN_No = "ETLPD23E";
		float Height = 5.2f;
		int salary= 87000;
		String email = "Bkitty15@gmail.com";
		boolean Jobstatus = true;
		
		//utilization 
		System.out.println("***************************************************************");
		System.out.println(EmpName+ " is the name of employee");
		System.out.println("holding the EmpId : "+EmpId);
		System.out.println("Employees PAN No. is  : "+PAN_No);
		System.out.println("Height of the Employee : "+Height+ " feet" );
		System.out.println("salary credited is arround "+salary);
		System.out.println("registerd Email Address - "+ email);
		System.out.println("job status is permanent "+Jobstatus);		
		System.out.println("***************************************************************");	

	}

}
