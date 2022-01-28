package unit22;

public class TestAnimal {
	   public static void main(String[] args) {
	      // Using the subclasses
	      Cat cat1 = new Cat("cat");
	      cat1.greets();
	      Dog dog1 = new Dog("dog");
	      dog1.greets();
	      BigDog bigDog1 = new BigDog("big dig");
	      bigDog1.greets();
	       
	      // Using Polymorphism
	      Animal animal1 = new Cat("cat");
	      animal1.greets();
	      Animal animal2 = new Dog("dog");
	      animal2.greets();
	      Animal animal3 = new BigDog("big dog");
	      animal3.greets();
	      // Animal animal4 = new Animal("animal"); Cannot instantiate abstract class
	   }
	}


