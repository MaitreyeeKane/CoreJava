package BasicJava;

public class DemoHello {
	public static void main(String[] args) {
		System.out.println("hello"+(args[2]));
		
		if (args.length==3) {
			System.out.println(args[0]);
			
		} else {
System.out.println(args[2]);
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println(i+"=hello"+args[i]);
			
			
			
			
		}
	}

}
