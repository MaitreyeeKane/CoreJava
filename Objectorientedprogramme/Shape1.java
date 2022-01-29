package Objectorientedprogramme;

public class Shape1 {
public static void main(String[] args) {
	Shape S= getShape(1);
	double area=S.area();
System.out.println("Area"+area);

}

private static Shape getShape(int i) {
if (i==1) {
	return new Circle(5);
}
if (i==2) {
return new Triangle (5,10);	
}
return null;
	
}
}
