package ex97;

public class Triangle extends Shape {
	private int Base;
	private int Height;
	public int getBase() {
		return Base;
	}
	public void setBase(int base) {
		Base = base;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
	triangle.setBase(12);
	triangle.setHeight(10);
	System.out.println("area = "+ triangle.getBase()* triangle.getHeight());
	}
}
