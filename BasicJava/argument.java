package BasicJava;

public class argument {

	public static double division(String s1, String s2) {
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		double div = a / b;
		return div;
	}

	public static void main(String[] args) {
		double div = division(args[0], args[1]);
		System.out.println(div);
	}
}
