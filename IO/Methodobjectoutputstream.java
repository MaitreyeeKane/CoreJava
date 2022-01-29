package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Methodobjectoutputstream {
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream("c:/object.ser ");
	ObjectOutputStream out = new ObjectOutputStream(file);
	Marksheetbean m = new Marksheetbean();
	m.setName("Raju");
	out.writeObject(m);
}
}
