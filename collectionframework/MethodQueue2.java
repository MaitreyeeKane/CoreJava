package collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class MethodQueue2 {
public static void main(String[] args) {
	Queue queue = new LinkedList<String>();
	queue.add("element1");
	queue.add("element2");
	System.out.println(queue.poll());  
	System.out.println(queue.remove());
	System.out.println(queue.peek());
	System.out.println(queue.remove(0));

	
}
}
