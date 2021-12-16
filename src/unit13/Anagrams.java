package unit13;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static boolean checkIfAnagrams(String string1, String string2) {
		char[] s1 = string1.toCharArray();
		char[] s2 = string2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.compare(s1, s2) == 0;
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
