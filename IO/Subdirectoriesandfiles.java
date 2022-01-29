package IO;

import java.io.File;

public class Subdirectoriesandfiles {
public static void main(String[] args) {
	File directory = new File ("C:\\Users\\Sir\\Desktop\\hello.txt");
	String[] files = directory.list();
	for(String f : files) {
		System.out.println(f);}
	
		
}
}
