package exceptionhandeling;

public class Ex8 {
public static void main(String[] args) {
	try {
		int j = 6;
		int y = 2;
		int div = j/y;
		System.out.println("ans is " + div);
	} catch (Exception e) {
		System.out.println("Error ");
	}
	finally {
		System.out.println("otherwise");
	}
	}
	
}

