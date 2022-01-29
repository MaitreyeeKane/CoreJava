package collectionframework;

import java.util.ArrayList;

public class List2 {
public static void main(String[] args) {
	ArrayList<Integer> l1 = new ArrayList<Integer>();
	l1.add(0,1);
	l1.add(1,2);
	System.out.println(l1);
	ArrayList m = new ArrayList();
	m.add(1);
	m.add(2);
	m.add(3);
	m.add(4);
  l1.addAll(1,m);
  System.out.println(l1);
  System.out.println(l1.get(3));
  l1.set(0,5);
  System.out.println(l1);

	}
}
