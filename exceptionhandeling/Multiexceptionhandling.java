package exceptionhandeling;

public class Multiexceptionhandling {
public static void main(String[] args) {
	String name = "Vijay";
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(7));
	} catch(NullPointerException e) {
		System.out.println("Name can't be null");
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("String is small");
	}
}
}
