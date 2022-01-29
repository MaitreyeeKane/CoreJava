package Objectorientedprogramme;

public class Person1 {
protected String FirstName= null;
protected String Lastname = null;
protected String address = null;

public Person1() {
	System.out.println("Person Default con");
}
public Person1(String fn,String ln) {
	FirstName= fn;
	Lastname = ln;
	System.out.println("2 params constructor is called ");
}
public Person1(String fn,String ln,String address) {
	FirstName=fn;
	Lastname=ln;
	this.address = address;
	
	System.out.println("3 Params constructor is called");
}
}
