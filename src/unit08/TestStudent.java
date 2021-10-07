package unit08;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Angel", 5.65F);
		Student.checkEligibleAndGiveScholarship(s);
		System.out.println(s.toString());
	}

}
