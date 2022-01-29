package Objectorientedprogramme;

public class Calculator3 {
public static void main(String[] args) {
	Calculator3 Calculator = new Calculator3();
	int sum =Calculator.addition(5, 5);
	System.out.println(sum);
}


public int addition (int a, int b) {
	int sum = a+b;
	return sum;
}
}
