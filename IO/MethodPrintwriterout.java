package IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MethodPrintwriterout {
public static void main(String[] args)throws IOException {
	PrintWriter out = new PrintWriter (new FileWriter("C:\\Users\\Sir\\Desktop\\c.txt"));
	InputStreamReader kb = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(kb);
	String line = in.readLine();
	while (!line.equals("quit")) {
	out.println(line);
	line = in.readLine();}
	in.close();out.close();kb.close();
}

}

