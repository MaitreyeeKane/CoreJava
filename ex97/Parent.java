package ex97;

public class Parent {
protected String Firstname;
public String Lastname;
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String alltogether() {
	return Firstname+Lastname;
	
}
}
