package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Methoddeserialize {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream file = new FileInputStream("C:/OBJECT.ser");
	ObjectInputStream in = new ObjectInputStream(file);
	Marksheetbean m = (Marksheetbean)in.readObject();
	System.out.println("Name:" + m.getName());
}
}
