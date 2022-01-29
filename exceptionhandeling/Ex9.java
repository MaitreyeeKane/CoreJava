package exceptionhandeling;

public class Ex9 {
public static void main(String[] args) {
	String name ="Madhuban";
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(9));
	}
	catch (NullPointerException e) {
		System.out.println("Name can't be null");
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("String is small");
	}
}
}
