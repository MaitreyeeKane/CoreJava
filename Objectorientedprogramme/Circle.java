package Objectorientedprogramme;

public class Circle extends Shape{
	private double radius;
	private static final double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle() {
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	 @Override
	 public double area() {
		return radius*radius*PI;
	}
public static void main(String[] args) {
	Circle obj = new Circle();
	obj.setRadius(10);
	System.out.println(obj.area());
}
}
