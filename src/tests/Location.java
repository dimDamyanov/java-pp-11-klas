package tests;

public class Location {
	public int row;
	public int column;
	public double maxValue;

	public static Location locateLargest(double[][] a) {
		Location TheBiggestElement = new Location();
		TheBiggestElement.row = 0;
		TheBiggestElement.column = 0;
		TheBiggestElement.maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > TheBiggestElement.maxValue) {
					TheBiggestElement.row = i;
					TheBiggestElement.column = j;
					TheBiggestElement.maxValue = a[i][j];
				}
			}
		}
		return TheBiggestElement;
	}
}