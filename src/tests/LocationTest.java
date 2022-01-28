package tests;

import java.util.Scanner;

public class LocationTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, z;
		System.out.print("Enter the number of rows and columns of the array: ");
		t = sc.nextInt(); // така се чете инт от конзолата
		z = sc.nextInt();
		double[][] arr = new double[t][z];
		System.out.println("Enter the array:");
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < z; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
		sc.close(); // загасяме скенера, защото сме заделили памет за него
		Location loc = Location.locateLargest(arr);
		System.out.println("The location of the largest element is " + loc.maxValue + " at " + "(" + loc.row + ","
				+ loc.column + ")");
	}
}