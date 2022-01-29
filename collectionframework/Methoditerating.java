package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Methoditerating {
public static void main(String[] args) {
	Collection c = new ArrayList();
	c.add("Raju");
 Iterator it = c.iterator();
 while (it.hasNext()) {
	Object o = (Object) it.next();
	System.out.println(o);
	 if (it.hasNext()) {
		it.remove();
	}
}
}
}
