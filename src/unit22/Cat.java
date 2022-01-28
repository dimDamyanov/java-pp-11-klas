package unit22;

public class Cat extends Animal {
	Cat(String name) {
		super(name);
	}

	@Override
	public void greets() {
		System.out.print("Meow\n");
	}
	
}
