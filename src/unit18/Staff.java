package unit18;

import java.util.Date;

public class Staff extends Employee {
	public String title;
	
	Staff(String newName, String newAddress, String newPhoneNumber, String newEmail, String newOffice, double newSalary, Date newDateHired, String newTitle) {
		super(newName, newAddress, newPhoneNumber, newEmail, newOffice, newSalary, newDateHired);
		this.title = newTitle;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + String.format(", Title: %s", this.title);
	}
}
