package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MethodReadandwritebinaryfile {
public static void main(String[] args) throws IOException {
	String source = " E:\\THIS IS MY FOLDER DO NOT OPEN\\keystand.jpg";
	String target = " E:\\THIS IS MY FOLDER DO NOT OPEN\\MQ-HOME-BANNER-.jpg";
	FileInputStream in = new FileInputStream(source);
	FileOutputStream out = new FileOutputStream(target);
	int ch = in.read();
	while(ch != -1) { 
		out.write(ch);
		ch = in.read();
	}
	out.close();in.close();
}
}
