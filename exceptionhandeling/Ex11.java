package exceptionhandeling;

import java.io.IOException;
import java.sql.SQLException;

public class Ex11 {
public static void main(String[] args) {
	String name ="Madhuban";
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(6));
	}
	catch(NullPointerException e) {
		System.out.println("Value cannot be null");
	} catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
}
}
