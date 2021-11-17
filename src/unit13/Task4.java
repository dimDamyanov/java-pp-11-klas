package unit13;

import java.util.Scanner;

public class Task4 {
	public static boolean checkIfAnagrams(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		
		int[] dict1 = new int[Character.MAX_VALUE];
		int[] dict2 = new int[Character.MAX_VALUE];
		
		for (int i = 0; i < string1.length(); i++) {
			dict1[string1.charAt(i)]++;
		}
		for (int i = 0; i < string2.length(); i++) {
			dict2[string2.charAt(i)]++;
		}
		
		for (int i = 0; i < dict1.length; i++) {
			if (dict1[i] != dict2[i]) {
				return false;
			} 
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1 = scanner.next();
		String string2 = scanner.next();
		scanner.close();
		if (checkIfAnagrams(string1, string2)) {
			System.out.print("two strings are anagrams");
		}
		else {
			System.out.print("two strings are not anagrams");
		}
	}
}
