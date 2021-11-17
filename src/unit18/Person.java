package unit18;

public class Person {
	public String name;
	public String address;
	public String phoneNumber;
	public String email;
	
	Person(String newName, String newAddress, String newPhoneNumber, String newEmail) {
		this.name = newName;
		this.address = newAddress;
		this.phoneNumber = newPhoneNumber;
		this.email = newEmail;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s, Adress: %s, Phone number: %s, e-mail: %s", name, address, phoneNumber, email);
	}
}
