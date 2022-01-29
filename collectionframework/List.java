package collectionframework;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("ram");
		a.add("shyam");
		a.add("shyam");
		a.add("Shyam");
		a.add("shyam");
		a.add("shyam");
		a.add("1");
		
		int q = a.size();
		for (int i = 0; i < q; i++) {
			System.out.println(a.get(i));
		}
		
		
	}

}
