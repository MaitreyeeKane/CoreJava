package ex97;

public class Person {
private String firstname;
private String lastname;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String tostring() {
	return firstname + lastname;
}
public Person() {
	
}
public static void main(String[] args) {
	Person P = new Person();
	P.setFirstname("Maitreyee");
	P.setLastname(" Kane");
	System.out.println(P.getFirstname()+ P.getLastname());
}
}
