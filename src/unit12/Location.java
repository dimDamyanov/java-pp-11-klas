package unit12;

public class Location {
	public int  row;
	public int column;
	public double maxValue;
	
	public static Location locateLargest(double a[][]) {
		Location maxElement = new Location();
		maxElement.row = 0;
		maxElement.column = 0;
		maxElement.maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxElement.maxValue) {
					maxElement.row = i;
					maxElement.column = j;
					maxElement.maxValue = a[i][j];
				}
			}
		}
		return maxElement;
	}
}
