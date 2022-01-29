package Objectorientedprogramme;

public class Calculator2 {
	int a = 100;
	int b = 10;

	public static void main(String[] args) {
		Calculator2 obj = new Calculator2();
		int sub = obj.substraction();
		System.out.println("sub--" + sub);
	}

	public int addition() {
		int sum = a + b;

		return sum;
	}

	public int substraction() {
		int sub = a - b;
		return sub;

	}

	public void multiplication() {
		int mul = a * b;
		System.out.println("mul--" + mul);
	}

}
