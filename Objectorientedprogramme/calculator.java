package Objectorientedprogramme;

public class calculator {
	int a = 100;
	int b = 10;
public static void main(String[] args) {
	
	calculator obj= new calculator ();
	int sum = obj.setaddition();
	System.out.println("sum is--"+sum);
}
public int setaddition() {
	int sum = 0;
	sum = a+b;
	return sum;
}
public int setsubstraction () {
	int sub = 0;
	sub = a-b;
	return sub;
	
}
public int multiplication () {
	int mul = 0;
	mul = a*b;
	return mul;
}
}
