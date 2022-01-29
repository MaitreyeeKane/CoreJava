package IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MethodDataOutputStream {
public static void main(String[] args) throws IOException {
	DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\Sir\\Desktop\\c.txt"));
	out.writeInt(1);
	out.writeBoolean(true);
	out.writeChar('A');
	out.writeDouble(1.2);
	out.close();
}
}
