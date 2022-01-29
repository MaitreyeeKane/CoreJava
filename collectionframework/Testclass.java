package collectionframework;

import java.util.ArrayList;

public class Testclass {
public static void main(String[] args) {
	ArrayList<Integer> u = new ArrayList<Integer>();
	u.add(3);
	u.add(4);
	u.add(5);
	u.add(7);
	System.out.println(u.get(2));
	u.set(0, 87);
	System.out.println(u.get(0));
	u.remove(2);
	System.out.println(u.get(2));
	System.out.println(u.indexOf(7));
	System.out.println(u.lastIndexOf(4));
	System.out.println(u.subList(0, 2));
	
	
}
}
