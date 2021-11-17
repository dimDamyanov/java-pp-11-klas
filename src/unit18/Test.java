package unit18;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Ivan", "ul. Iskar, 61", "+359123456789" , "ivan@abv.bg");
		Employee employee = new Employee("Petar", "ul. Bigla, 21", "+359987654321", "petar@abv.bg", "407A", 2500, new Date(1637110284000L));
		Faculty faculty = new Faculty("Nikolay", "ul. Rakovska, 33", "+359369258147", "nikolay@abv.bg", "311B", 5000, new Date(1447721484000L), "09:00-17:00", "Professor");
		Staff staff = new Staff("Kamen", "bul. Ruski, 12", "+359741235698", "kamen@abv.bg", "206A", 1750, new Date(1289955464000L), "Hygienist");
		Student student = new Student("Kaloyan", "ul. Zadmorska, 45", "+359875316429", "kaloyan@abv.bg", "senior");
		
		System.out.println(person.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		System.out.println(student.toString());
	}

}
