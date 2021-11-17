package unit13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ssn = scanner.next();
		scanner.close();
		
		if (Pattern.matches("\\d{3}-\\d{2}-\\d{4}", ssn)) {
			System.out.print("Valid SSN");
		}
		else {
			System.out.print("Invalid SSN");
		}
	}
}
