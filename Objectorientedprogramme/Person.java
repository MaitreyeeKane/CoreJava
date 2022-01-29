package Objectorientedprogramme;

import java.util.Date;

public class Person {
	private String name = "person";
	private Date DOB = getDOB();
	private String address = "xyz";
	public static final int AVG = 22;

	public String getname() {
		return name;
	}

	public void setname(String Name) {
		this.name = Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String Address) {
		this.address = Address;
	}

	public Date getDOB() {
		return DOB;
	}

	public int getAge() {
		return 22;
	}

	public void setAge(int AGE) {
		AGE = AVG;
	}
}
