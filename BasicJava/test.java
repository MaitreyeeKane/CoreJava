package BasicJava;

public class test {
	public static void main(String[] args) {
		String name = "Python";
		switch (name) {
		case "java":
			System.out.println("case java executed");
			break;
		case "Python":
			System.out.println("case python executed");
			break;
		default:
			System.out.println("default executed");
			break;
		}

	}
}