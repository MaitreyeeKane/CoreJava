package collectionframework;

import java.util.ArrayList;

public class Methodarr {
public static void main(String[] args) {
	ArrayList names = new ArrayList();
	for (int i = 0; i < args.length; i++) {
		names.add("No #" + i);
	}
	System.out.println("names :"+ names.size());
	Object o = names.get(0);
	String name = (String) o;
	System .out.println("First name is"+name);
}


}
