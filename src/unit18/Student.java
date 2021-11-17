package unit18;

public class Student extends Person {
	public String classStatus;
	
	Student(String newName, String newAddress, String newPhoneNumber, String newEmail, String newClassStatus) {
		super(newName, newAddress, newPhoneNumber, newEmail);
		this.classStatus = newClassStatus;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(", Class status: %s", this.classStatus);
	}
}
