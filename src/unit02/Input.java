package unit02;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age = input.nextInt();
		input.nextLine();
		
		if (age >= 18) {
			System.out.println("Have you ever voted before?");
			@SuppressWarnings("unused")
			String answer = input.nextLine();
			
			input.close();
		}
	
		System.out.println("Goodbye!");
	}

}
