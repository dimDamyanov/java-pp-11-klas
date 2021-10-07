package unit08;

public class Student {
	String name;
	float groundPointAverage;
	double balance;
	
	Student() {}
	
	Student(String newName, float newGroundPointAverage) {
		this.name = newName;
		this.groundPointAverage = newGroundPointAverage;
	}
	
	public String toString() {
		return String.format("Name: %s, Ground point average: %.2f, Balance: %.2f", this.name, this.groundPointAverage, this.balance);
	}
	
	public static void checkEligibleAndGiveScholarship(Student student) {
		if (student.groundPointAverage >= 5.50) {
			student.balance += 100;
		}
	}
}
