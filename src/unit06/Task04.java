package unit06;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task04 {

	public static boolean isLeap(int year) {
		if (year % 4 != 0) {
			return false;
		}
		else if (year % 100 != 0) {
			return true;
		}
		else if (year % 400 != 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static int[][] constructMonthGrid(int startingWeekDay, int days) {
		int[][] monthGrid = new int[6][7];
		int currentWeek = 0, currentWeekDay = startingWeekDay % 7;
		
		for (int i = 1; i <= days; i++) {
			
			monthGrid[currentWeek][currentWeekDay] = i;
			
			if (currentWeekDay == 6) {
				currentWeekDay = 0;
				currentWeek++;
			}
			else {
				currentWeekDay++;
			}
		}
		
		return monthGrid;
	}
	
	public static void printMonth(String monthName, int monthDays, int startingWeekDay) {
		for (int i = 0; i < (50 - monthName.length())/2; i++) {
			System.out.print(' ');
		}
		System.out.println(monthName);
		
		for (int i = 0; i < 50; i++) {
			System.out.print('-');
		}
		System.out.println();
		System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");
		
		int[][] monthGrid = constructMonthGrid(startingWeekDay, monthDays);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (monthGrid[i][j] == 0) {
					if (i != 0) {
						System.out.println();
						if (j != 0) { 
							System.out.println();
						}
						return;
					}
					else {
						System.out.print(" \t");
					}	
				}
				else {
					System.out.print(monthGrid[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {		
		Map<String, Integer> monthDays = new LinkedHashMap<String, Integer>();
		monthDays.put("January", 31);
		monthDays.put("February", 0);
		monthDays.put("March", 31);
		monthDays.put("April", 30);
		monthDays.put("May", 31);
		monthDays.put("June", 30);
		monthDays.put("July", 31);
		monthDays.put("August", 31);
		monthDays.put("September", 30);
		monthDays.put("October", 31);
		monthDays.put("November", 30);
		monthDays.put("December", 31);
		
		Scanner input = new Scanner(System.in);
		
		int year, startingWeekDay, currentStartingWeekDay;
		System.out.print("Year: ");
		year = input.nextInt();
		System.out.print("Week day: ");
		startingWeekDay = input.nextInt() - 1;
		input.close();
		currentStartingWeekDay = startingWeekDay;
		
		if (isLeap(year)) {
			monthDays.put("February", 29);
		}
		else {
			monthDays.put("February", 28);
		}
		
		for (Map.Entry<String, Integer> entry: monthDays.entrySet()) {
			printMonth(entry.getKey(), entry.getValue(), currentStartingWeekDay);
			currentStartingWeekDay += entry.getValue() % 7;
			currentStartingWeekDay %= 7;
		}
		
	}
}
