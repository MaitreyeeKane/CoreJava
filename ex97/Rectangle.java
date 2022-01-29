package ex97;

public class Rectangle extends Shape{
private int length;
private int width;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public static void main(String[] args) {
	Rectangle rectangle = new Rectangle ();
	rectangle.setLength(10);
	rectangle.setWidth(12);
	System.out.println("Area = " + rectangle.getLength()*rectangle.getWidth());
	
}
}
