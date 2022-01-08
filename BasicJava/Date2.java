package BasicJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {
	public static void main(String[] args) throws Exception {
		String Maitreyee = "17/07/1999";

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		Date date = format.parse(Maitreyee);

		System.out.println(date);
	}
}
