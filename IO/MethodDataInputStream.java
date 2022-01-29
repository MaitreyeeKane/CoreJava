package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodDataInputStream {
public static void main(String[] args) throws IOException {
	DataInputStream in = new DataInputStream (new FileInputStream("C:\\Users\\Sir\\Desktop\\c.txt"));
	System.out.println(in.readInt());
	System.out.println(in.readBoolean());
	System.out.println(in.readChar());
	System.out.println(in.readDouble());
	in.close();
}
}
