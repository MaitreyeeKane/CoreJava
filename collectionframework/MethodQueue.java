package collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class MethodQueue {
public static void main(String[] args) {
	Queue<String> q = new LinkedList();
	q.add("element1");
	q.offer("element2");
System.out.println(q.offer("Element2"));
}
}
