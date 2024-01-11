package mockProgram;

public class Students {
  int roll_no;
  String name;

	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentinfo();

	}
public void student_info() 
{ 
	roll_no = 22;
	name= "kitty";
	System.out.println("roll no. is "+roll_no);
	System.out.println("my name is "+ name);
	
}
public void getStudentinfo()
{
	student_info();
}
}
