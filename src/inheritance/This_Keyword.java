package inheritance;

public class This_Keyword {
   String name = "kitty";
	public static void main(String[] args) {
		
		This_Keyword tk = new This_Keyword();
		tk.ns_class();
		
	}
	
public void ns_class()
{
	String name = "localtush";
	System.out.println(name);
	System.out.println(this.name);
}
}
