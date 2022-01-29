package collectionframework;

import java.util.Vector;

public class Methodvector {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("one");
	v.add("two");
	v.add("Three");
	 
	 Integer i = new Integer(4);
	 v.add(i);
	  Integer value = (Integer) v.get(3);
	  System.out.println("Index# Value =" + value);
	 
	
}
}
