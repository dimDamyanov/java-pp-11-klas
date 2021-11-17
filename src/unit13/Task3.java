package unit13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		scanner.close();
		
		if (Pattern.matches("^(?=[\\w]*[A-Za-z])(?=[\\w]*\\d{2,})[A-Za-z\\d]{8,}$", password)) {
			System.out.print("Valid Password");
		}
		else {
			System.out.print("Invalid Password");
		}
	}
}
