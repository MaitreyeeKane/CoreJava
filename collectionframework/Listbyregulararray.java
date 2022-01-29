package collectionframework;

import java.util.Iterator;

public class Listbyregulararray {
public static void main(String[] args) {
	String[]names = new String [5];
	for (int i = 0; i < names.length; i++) {
		names[i]= "No #" + i;		
	}
	System.out.println("Names="+ names.length);
}
}
