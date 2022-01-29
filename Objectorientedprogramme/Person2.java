package Objectorientedprogramme;

public class Person2 {
	protected String firstname = null;
	protected String Lastname = null;
	protected String address = null;
public Person2 () {
	System.out.println("default Constructor");
}
public Person2 (String fn, String ln) {
	firstname = fn;
	Lastname = ln;
	System.out.println("2 params constructor");
}
public Person2(String fn,String ln,String address) {
	this(fn,ln);
this.address = address;
System.out.println("3 params constructor");
}
}
