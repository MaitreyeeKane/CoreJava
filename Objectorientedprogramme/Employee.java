package Objectorientedprogramme;

public class Employee extends Person2{
private String designation = null;
public Employee() {
	System.out.println("Default Constructors");
}
public Employee (String fn, String ln,String des) {
	super(fn,ln);
	designation = des;
	System.out.println("3 params constructor");
}
}
