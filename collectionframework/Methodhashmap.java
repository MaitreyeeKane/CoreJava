package collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Methodhashmap {
public static void main(String[] args) {
	HashMap m = new HashMap() ;
	m.put("RN1001", 890);
	m.put("RN1002", 900);
	m.put("RN1003", 780);
	Integer i = (Integer) m.get("RN1002");
	Set keys = m.keySet();
	Collection vals = m.values();
			
}
}
