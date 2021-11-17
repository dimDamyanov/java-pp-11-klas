package unit05;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3, x4, y4;
		System.out.print("X1= ");
		x1 = input.nextInt();
		System.out.print("Y1= ");
		y1 = input.nextInt();
		System.out.print("X2= ");
		x2 = input.nextInt();
		System.out.print("Y2= ");
		y2 = input.nextInt();
		System.out.print("X3= ");
		x3 = input.nextInt();
		System.out.print("Y3= ");
		y3 = input.nextInt();
		System.out.print("X4= ");
		x4 = input.nextInt();
		System.out.print("Y4= ");
		y4 = input.nextInt();
		input.close();
		
		String smallerRectangle, largerRectangle;
		int area1 = Math.abs(x1 - x2) * Math.abs(y1 - y2);
		int area2 = Math.abs(x3 - x4) * Math.abs(y3 - y4);
		if (area1 < area2) {
			smallerRectangle = "First";
			largerRectangle = "second";
		}
		else {
			smallerRectangle = "Second";
			largerRectangle = "first";
		}
		
		if (x1 > x2 && y1 < y2) {
			int xTemp = x2, yTemp = y2;
			x2 = x1;
			x1 = xTemp;
			y2 = y1;
			y1 = yTemp;
		} 
		else if (x1 > x2 ^ y1 < y2) {
			System.out.println("Wrong input data!");
			return;
		}
		
		if (x3 > x4 && y3 < y4) {
			int xTemp = x4, yTemp = y4;
			x4 = x3;
			x3 = xTemp;
			y4 = y3;
			y3 = yTemp;
		}
		else if (x3 > x4 ^ y3 < y4) {
			System.out.println("Wrong input data!");
			return;
		}
		
		if (area2 > area1) {
			int x1Temp = x3, x2Temp = x4, y1Temp = y3, y2Temp = y4;
			x3 = x1;
			x4 = x2;
			x1 = x1Temp;
			x2 = x2Temp;
			y3 = y1;
			y4 = y2;
			y1 = y1Temp;
			y2 = y2Temp;
		}
		
		if ((x3 > x1 && x3 < x2) && (x4 > x1 && x4 < x2)) {
			if ((y3 < y1 && y3 > y2) && (y4 < y1 && y4 > y2)) {
				// Rectangles are nested
				System.out.println(smallerRectangle + " rectangle is nested in " + largerRectangle + " rectangle");
			}
			else if ((y3 < y1 && y3 > y2) ^ (y4 < y1 && y4 > y2)) {
				// Rectangles are intersecting
				System.out.println("Rectangles are intersecting");
			}
			else {
				// Rectangles are neither nested or intersecting
				System.out.println("Rectangles are neither nested or intersecting");
			}
		}
		else if ((x3 > x1 && x3 < x2) ^ (x4 > x1 && x4 < x2)) {
			if ((y3 < y1 && y3 > y2) || (y4 < y1 && y4 > y2)) {
				// Rectangles are intersecting
				System.out.println("Rectangles are intersecting");
			}
			else {
				// Rectangles neither nested or intersecting
				System.out.println("Rectangles neither nested or intersecting");
			}
		}
		else {
			// Rectangles are intersecting one of the sides is common for both rectangles
			System.out.println("Rectangles are intersecting one of the sides is common for both rectangles");
		}
	}
}
