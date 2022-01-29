package Objectorientedprogramme;

public class Triangle extends Shape{
	private int Base;
	private int Height;
	public Triangle(int i, int j) {
		
	}
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public double area() {
		return Base* Height/2;
	}
	public static void main(String[] args) {
		Triangle obj= new Triangle();
		obj.setBase(4);
		obj.setHeight(10);
		System.out.println(0.5*obj.getBase()*obj.getHeight());
	}
}
