package methodCalling;

public class MethodWithParameters {

	public static void main(String[] args) {
		MethodWithParameters emp = new MethodWithParameters();
       emp.employData("kitty", 'F', 80000, "CREDITED");
       emp.employData("Tush", 'M', 85000, "CREDITED");
       emp.employData("scott", 'M', 70000, "Pending");
       calculation("At-11:30", 40000, 16000, 2000 );
       calculation("At-4:00", 600000, 100000, 90000);
       
       
	}
 public void employData( String name, char gender, int salary, String salarystatus)
 {   
	 System.out.println("*************************************************");
	 System.out.println("employ name "+ name);
	 System.out.println("employ gender "+ gender);
	 System.out.println("employ salary "+ salary);
	 System.out.println("todays salary status "+salarystatus);
	 
 }
 public static void calculation (String time ,int a, int b , int c) 
 {  System.out.println("***************************************************");
	 int total;
	 total = a+b-c;
	 
	 System.out.println("todays collection is "+ total + " -  Sharp"+time);
 }
  protected void A()

{  
	 
	 System.out.println("method a from pack-methodclaalin-class methodswith parameter");
	 
}	
}