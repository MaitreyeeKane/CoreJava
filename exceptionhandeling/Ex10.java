package exceptionhandeling;

public class Ex10 {
public static void main(String[] args) {
	String name ="Madhuban";
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(9));
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
}
}}
