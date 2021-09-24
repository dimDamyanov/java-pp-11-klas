package loops;
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
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int year, weekDay;
		System.out.print("Year: ");
		year = input.nextInt();
		System.out.print("Week day: ");
		weekDay = input.nextInt();
		
		String[] months = ["January", ""]
	}

}
