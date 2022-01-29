package Objectorientedprogramme;

public class testShape {
public static void main(String[] args) {
	Circle c = new Circle ();
	c.setcolor("Red");
	c.setborderwidth(5);
	c.setRadius(2);
	System.out.println(c.getcolor());
	System.out.println(c.getborderwidth());
	System.out.println(c.getRadius());
	System.out.println(c.area());

}
}
