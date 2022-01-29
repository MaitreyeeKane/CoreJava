package ex414;

public class Q13 {
	public static void main(String[] args) {
		int num = 5;
		double result = 0.0;
		System.out.println("The harmonic series is:");
		for (int i = num; i < 0; i--) {
			result = result + (double)1/i;
			System.out.println(result+" , ");
			
		}
	}

}
