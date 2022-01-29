package IO;


import java.io.BufferedReader;
import java.io.FileReader;

public class Methodbufferreader {
public static void main(String[] args) throws Exception {
	FileReader r = new FileReader("C:\\Users\\Sir\\Desktop\\hello.txt");
BufferedReader br = new BufferedReader(r);
int ch = br.read();
String line = br.readLine();

}
}
