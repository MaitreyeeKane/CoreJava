package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Methoditerating2 {
public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.add(12);
	numbers.add(8);
	numbers.add(13);
	numbers.add(23);
	numbers.add(56);
	 Iterator<Integer>it = numbers.iterator();
	 while (it.hasNext()) {
		Integer i = (Integer) it.next();
		if (i<10) {
			it.remove();
		}
	}
	 System.out.println(numbers);
}
}
