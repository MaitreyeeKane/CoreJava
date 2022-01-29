package ex414;

public class Q4factorial {
	public static void main(String[] args) {
		int i,fact=1;
		int number=5;
		for (int j = 1; j <=number; j++) {
			fact=fact*j;
			System.out.println("factorial of"+number+"is:"+fact);
			
		}
	}

}
