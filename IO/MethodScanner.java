package IO;

import java.io.FileReader;
import java.util.Scanner;

public class MethodScanner {
public static void main(String[] args) throws Exception{
	FileReader r = new FileReader("C:\\Users\\Sir\\Desktop\\hello.txt");
	Scanner sc = new Scanner (r);
	while (sc.hasNext()) {
		String line = sc.nextLine();
		System.out.println(line);
		
	}
}
}
