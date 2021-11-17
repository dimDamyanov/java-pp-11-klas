package unit12;

import java.util.Scanner;

public class LocationTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, m;
		System.out.print("Enter the number of rows and columns in the array: ");
		n = scanner.nextInt();
		m = scanner.nextInt();
		double[][] array = new double[n][m];
		System.out.println("Enter the array:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = scanner.nextDouble();
			}
		}
		scanner.close();
		Location location = Location.locateLargest(array);
		System.out.printf("The location of the largest element is %.2f at (%d, %d)", location.maxValue, location.row, location.column);
	}
}
