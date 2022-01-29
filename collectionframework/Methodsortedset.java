package collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class Methodsortedset {
public static void main(String[] args) {
	SortedSet<String>s = new TreeSet<String>();
	s.add("one");
	s.add("two");
	s.add("three");
for(Object ele : s) {
	System.out.println(ele);
}
System.out.println(s.first());
System.out.println(s.last());
}
}
