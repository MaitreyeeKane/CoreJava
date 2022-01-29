package exceptionhandeling;

public class ProgrammeExceptions {
public static boolean isValiduser() {
	return false;
	
}
public static void main(String[] args) {
	boolean userFound = isValiduser();
	if (userFound) {
		System.out.println("Valid User");
	} else {
RuntimeException e = new RuntimeException ("Invalid user");
throw e;
	}
}
}
