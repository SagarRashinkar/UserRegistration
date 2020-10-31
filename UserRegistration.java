import java.util.*;

class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String fname = sc.next();
		System.out.println(validFirstName(fname));
		
		System.out.println("Enter last name:");
		String lname = sc.next();
		System.out.println(validLastName(lname));
	}

	public static String validFirstName(String fname) {

		String pat = "^[A-Z]{1}[a-z]*";
		if(fname.matches(pat))
			return "First name is Valid";
		else
			return "First name is InValid";
	}
	
	public static String validLastName(String lname) {

		String pat = "^[A-Z]{1}[a-z]*";
		if(lname.matches(pat))
			return "Last name is Valid";
		else
			return "Last name is InValid";
	}
}