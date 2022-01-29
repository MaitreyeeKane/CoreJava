package IO;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class MethodBufferWriter {
public static void main(String[] args)throws Exception {
	FileWriter w = new FileWriter("C:\\Users\\Sir\\Desktop\\do.txt");
	BufferedWriter bw = new BufferedWriter(w);
	char[] cArray = {'H','i'};
	bw.write(cArray);
	bw.write(',');
	bw.write("sunilos");
	bw.close(); w.close();
}
}
