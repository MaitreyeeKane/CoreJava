package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MethodPrintwriter {
public static void main(String[] args) throws IOException ,ClassNotFoundException {
	FileWriter file = new FileWriter("C:\\Users\\Sir\\Desktop\\c.txt");
	PrintWriter out = new PrintWriter (file,true);
	out.println("Line 1");
	out.println("Line 2");
	out.close();file.close();
}
}
