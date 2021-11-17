package unit06;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.print("n= ");
		n = input.nextInt();
		input.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j < n-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
