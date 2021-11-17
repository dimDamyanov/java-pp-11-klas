package unit18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {
	public String office;
	public double salary;
	public Date dateHired;
	
	Employee(String newName, String newAddress, String newPhoneNumber, String newEmail, String newOffice, double newSalary, Date newDateHired) {
		super(newName, newAddress, newPhoneNumber, newEmail);
		this.office = newOffice;
		this.salary = newSalary;
		this.dateHired = newDateHired;
	}
	
	@Override
	public String toString() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(this.dateHired);
		return super.toString() + String.format(", Office: %s, Salary: %s, Date hired: %s", office, salary, date);
	}
}
