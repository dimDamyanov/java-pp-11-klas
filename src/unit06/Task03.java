package unit06;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.print("n= ");
		n = input.nextInt();
		input.close();
		double sum1 = 0, sum2 = 0;
		
		for(int i = 1; i <= n; i++) {
			sum1 += 1/(double) i;
		}

		for(int i = n; i > 0; i--) {
			sum2 += 1/(double) i;
		}
		
		System.out.println("sum1= " + sum1);
		System.out.println("sum2= " + sum2);
		System.out.println("delta= " + Math.abs(sum1 - sum2));
	}

}
