package IO;

import java.io.FileWriter;

public class MethodFileWriter {
public static void main(String[] args)throws Exception {
	FileWriter w = new FileWriter("C:\\Users\\Sir\\Desktop\\b.txt");
	char[] cArray = {'H','i'};
	w.write(cArray);
	w.write(',');
	w.write("Sunilos");
	w.close();
}
}
