import java.util.*;

class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//Scanner class to take input from user

		System.out.println("Enter first name:");
		String fname = sc.next();
		System.out.println(validFirstName(fname));		//call to the first name validation method
		
		System.out.println("Enter last name:");
		String lname = sc.next();
		System.out.println(validLastName(lname));		//call to the last name validation method
		
		System.out.println("Enter email:");
		String email = sc.next();
		System.out.println(validEmail(email));			//call to the mail validation method
		
		System.out.println("Enter mobile number:");
		String number = sc.next();
		System.out.println(validNumber(number));		//call to the mobile number validation method
		
		System.out.println("Enter password:");
		String pass = sc.next();
		System.out.println(validPassword(pass));		//call to the password validation method
	}

	public static String validFirstName(String fname) {		// first name validation method

		String pat = "^[A-Z]{1}[a-z]*";
		if(fname.matches(pat))
			return "First name is Valid";
		else
			return "First name is InValid";
	}
	
	public static String validLastName(String lname) {		//last name validation method

		String pat = "^[A-Z]{1}[a-z]*";
		if(lname.matches(pat))
			return "Last name is Valid";
		else
			return "Last name is InValid";
	}
	
	public static String validEmail(String email) {			//email validation method

		String pat = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.]+(co|com|in|au)$";
		if(email.matches(pat))
			return "email is Valid";
		else
			return "email is InValid";
	}
	
	public static String validNumber(String number) {		//mobile number validation method

		String pat = "(0|91)?[7-9][0-9]{9}";
		if(number.matches(pat))
			return "mobile number is Valid";
		else
			return "mobile number is InValid";
	}

	public static String validPassword(String pass) {		//password validation method

		String pat = "^*(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		if(pass.matches(pat))
			return "password is Valid";
		else
			return "password is InValid";
	}
}
