package unit13;

import java.util.Scanner;

public class Task1 {
	public static boolean checkIfPalindrome(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (i >= word.length() - (i + 1)) {
				break;
			}
			if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 String word;
		 word = scanner.next();
		 scanner.close();
		 System.out.print(checkIfPalindrome(word));
	}

}
