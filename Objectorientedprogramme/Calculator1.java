package Objectorientedprogramme;

public class Calculator1 {
public static void main(String[] args) {
	Calculator1 obj = new Calculator1 ();
       obj.substraction();    ;
}
	
	   
  public void addition () {
	int a = 100;
	int b = 10;
	int sum = a + b ;
	System.out.println("sum is--" + sum);} 
	
	public void substraction() {
	int a = 100;
	int b = 10;
     int sub = a - b ;
	System.out.println("sub is--" + sub);
	
}
	public void multiplication() {
		int a = 100;
		int b = 10;
		int mul = a*b;
		System.out.println("multiplication is "+ mul);
	}
}

