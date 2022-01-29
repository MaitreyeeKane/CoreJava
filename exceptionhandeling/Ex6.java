package exceptionhandeling;

public class Ex6 {
public static void main(String[] args) throws LoginException{
	int value = 10;
	LoginException e = new LoginException();
		
	if (value<25) throw e;	
	
}
}

	
