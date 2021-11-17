package unit11;

import java.util.Scanner;

public class Task04 {
	public static boolean sudokuCheck(int[][] sudokuTable) {
		// Check rows
		for (int i = 0; i < sudokuTable.length; i++) {
			boolean[] checklist = new boolean[9];
			for (int j = 0; j < sudokuTable[i].length; j++) {
				if (checklist[sudokuTable[i][j] - 1] == true) {
					// System.out.printf("Row - r=%d c=%d, v=%d", i, j, sudokuTable[i][j]);
					return false;
				}
				checklist[sudokuTable[i][j] - 1] = true;
			}
		}
		// Check columns
		for (int i = 0; i < sudokuTable[1].length; i++) {
			boolean[] checkList = new boolean[9];
			for (int j = 0; j < sudokuTable.length; j++) {
				if (checkList[sudokuTable[j][i] - 1] == true) {
					// System.out.printf("Col - r=%d c=%d, v=%d", i, j, sudokuTable[i][j]);
					return false;
				}
				checkList[sudokuTable[j][i] - 1] = true;
			}
		}
		// Check squares
		for(int i = 0; i < sudokuTable.length; i+=3) {
			for (int j = 0; j < sudokuTable.length; j+=3) {
				boolean[] checklist = new boolean[9];
				for (int g = 0; g < 3; g++) {
					for (int h = 0; h < 3; h++) {
						if (checklist[sudokuTable[i+g][j+h]-1] == true) {
							// System.out.printf("Squ - r=%d c=%d, v=%d", i+g, j+h, sudokuTable[i+g][j+h]);
							return false;
						}
						checklist[sudokuTable[i+g][j+h]-1] = true;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] sudokuTable = new int[9][9];
		String currentLine;
		for(int i = 0; i < sudokuTable.length; i++) {
			currentLine = scanner.next();
			for(int j = 0; j < currentLine.length(); j++) {
				sudokuTable[i][j] = currentLine.charAt(j) - 48;
			}
		}
		scanner.close();
		/*
		for(int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(sudokuTable[i][j]);
			}
			System.out.println();
		}
		*/
		System.out.print(sudokuCheck(sudokuTable));
	}
}
