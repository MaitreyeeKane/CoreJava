package IO;

import java.io.File;

public class DeleteorRename {
public static void main(String[] args) {
	File file = new File ("C:\\Users\\Sir\\Desktop\\a.txt");
	file.renameTo(new File("b.txt"));
	file.delete();
	file.deleteOnExit();
}
}
