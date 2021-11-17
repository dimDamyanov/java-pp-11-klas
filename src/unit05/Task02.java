package unit05;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		String isbnString = input.next();
		input.close();
		char checkDigit;
		
		for (int i = 0; i < isbnString.length(); i++) {
			sum += ((int) isbnString.charAt(i) - 48) * (i+1);
		}
		
		if (sum % 11 == 10) {
			checkDigit = 'X';
		} 
		else {
			checkDigit = (char)(sum % 11 + 48);
		}
		
		System.out.println("ISBN: " + isbnString + checkDigit);
	}

}
