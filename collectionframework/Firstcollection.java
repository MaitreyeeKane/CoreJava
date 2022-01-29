package collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Firstcollection {
public static void main(String[] args) {
	Collection c = new ArrayList();
	c.add("Bura mat dekho");
	c.add("Bura mat suno");
	c.add("Bura mat bolo");
	System.out.println("Length of collection:" + c.size());	
	for(Object ele:c) {
		System.out.println(ele);
		Object[] oArray = c.toArray();
	
for(Object el:oArray) {
	String s = (String) el;
	System.out.println(s);
}
}
}
}
