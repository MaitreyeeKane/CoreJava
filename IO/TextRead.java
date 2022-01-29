package IO;

import java.io.FileReader;

public class TextRead {
public static void main(String[] args)throws Exception {
	FileReader reader = new FileReader ("C:\\Users\\Sir\\Desktop\\hello.txt");
	int ch =reader.read();
	char chr;
	while (ch != 1) {
	chr = (char)ch;
	System.out.println(chr);
	ch = reader.read();
	}
	reader.close();
}}
