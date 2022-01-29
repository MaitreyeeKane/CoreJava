package collectionframework;

import java.util.ArrayList;

public class Methodarraylist {
public static void main(String[] args) {
	ArrayList v = new ArrayList();
	v.add("One");
	int size = v.size();
	for (int i = 0; i < size; i++) {
		System.out.println(i + ":"+ v.get(i));
		Object O = v.get(i);
		System.out.println(i + ":"+ O);
		Object o = v.get(i);
		System.out.println(i + ":"+ o.toString());
	}
}
}
