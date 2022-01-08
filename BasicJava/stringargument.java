lpackage BasicJava;

public class stringargument {
	public static void main(String[] args) {
		String S = "Vijay Dinanath Chauhan";
		char Ch[] = S.toCharArray();
		int count = 0;

		for (int i = 0; i < S.length(); i++) {
			if (Ch[i] == 'a') {
				count++;

			}
	
		}

		System.out.println("count of a is---" + count);
	}
}
