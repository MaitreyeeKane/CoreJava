package Objectorientedprogramme;

public class Demo {
	int b;
	int a;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.setA(20);
		obj.setB(25);
		int a = obj.getA();
		int b = obj.getB();
		System.out.println(a + b);
	}
}
