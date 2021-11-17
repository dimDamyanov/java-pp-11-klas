package unit11;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[][] studentAnswers = new char[8][10];
		char[] answerKey = new char[10];
		String currentLine;
		int currentResult;
		
		for (int i = 0; i < studentAnswers.length; i++) {
			System.out.printf("Student %d: ", i+1);
			currentLine = scanner.next();
			for(int j = 0; j < currentLine.length(); j++) {
					studentAnswers[i][j] = currentLine.charAt(j);
			}
		}
		
		System.out.print("Answer key: ");
		currentLine = scanner.next();
		scanner.close();
		for(int i = 0; i < answerKey.length; i++) {
			answerKey[i] = currentLine.charAt(i);
		}
		
		for(int i = 0; i < studentAnswers.length; i++) {
			currentResult = 0;
			for (int j = 0; j < studentAnswers[i].length; j++) {
				if (studentAnswers[i][j] == answerKey[j]) {
					currentResult++;
				}
			}
			System.out.printf("Student %d: %d pt\n", i+1, currentResult);
		}
	}
}
