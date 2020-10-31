import java.util.*;

class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String fname = sc.next();
		System.out.println(validFirstName(fname));
	}

	public static String validFirstName(String fname) {

		String pat = "^[A-Z]{1}[a-z]*";
		if(fname.matches(pat))
			return "Valid";
		else
			return "InValid";
	}
}
