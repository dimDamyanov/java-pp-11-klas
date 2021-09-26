package branchedAlgorithms;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		String isbnString = input.next();
		input.close();
		char[] isbn = new char[10];
		
		for (int i = 0; i < isbnString.length(); i++) {
			sum += ((int) isbnString.charAt(i) - 48) * (i+1);
			isbn[i] = isbnString.charAt(i);
		}
		
		if (sum % 11 == 10) {
			isbn[9] = 'X';
		} 
		else {
			isbn[9] = (char)(sum % 11 + 48);
		}
		
		System.out.println("ISBN: " + new String(isbn));
	}

}
