package unit18;

import java.util.Date;

public class Faculty extends Employee {
	public String officeHours;
	public String rank;
	
	Faculty(String newName, String newAddress, String newPhoneNumber, String newEmail, String newOffice, double newSalary, Date newDateHired, String newOfficeHours, String newRank) {
		super(newName, newAddress, newPhoneNumber, newEmail, newOffice, newSalary, newDateHired);
		this.officeHours = newOfficeHours;
		this.rank = newRank;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(", Office hours: %s, Rank: %s", this.officeHours, this.rank);
	}
}
