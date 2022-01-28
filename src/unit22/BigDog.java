package unit22;

public class BigDog extends Dog {

	BigDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void greets() {
		// TODO Auto-generated method stub
		System.out.print("Wooow\n");
	}

	@Override
	public void greets(Dog dog) {
		System.out.print("Woooooow\n");
	}
	
	public void greets(BigDog bigDog) {
		System.out.print("Wooooooooow\n");
	}

}
