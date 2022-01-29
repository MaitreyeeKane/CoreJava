package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Methodbufferinputstream {
public static void main(String[] args)throws IOException {
	BufferedInputStream in = new BufferedInputStream(new FileInputStream("E:\\THIS IS MY FOLDER DO NOT OPEN\\MQ-HOME-BANNER-.jpg"));
	BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("E:\\THIS IS MY FOLDER DO NOT OPEN\\craftublary.jpg"));
	byte[] buff = new byte [256];
	int count = in.read(buff);
	while(count > 0) {
		out.write(buff,0,count);
		count = in.read(buff);
	}
	out.close();
	System.out.println("success");
}
}
