package unit22;

public class Dog extends Animal {

	Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void greets() {
		// TODO Auto-generated method stub
		System.out.print("Woof\n");
	}
	
	public void greets(Dog dog) {
		System.out.print("Woooof\n");
	}
	
}
