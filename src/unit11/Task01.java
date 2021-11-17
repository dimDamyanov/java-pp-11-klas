package unit11;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task01 {
	
	public static void shuffleIntArray(int[] array) {
		Random random = ThreadLocalRandom.current();
		for (int i = array.length - 1; i > 0; i--) {
			int ind = random.nextInt(i+1);
			int t = array[ind];
			array[ind] = array[i];
			array[i] = t;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			System.out.print(String.format("n%d=", i+1));
			array[i] = scanner.nextInt();
		}
		scanner.close();
		
		shuffleIntArray(array);
		
		System.out.print("{");
		for(int i = 0; i < array.length; i++) {
			System.out.print((i!=(array.length-1))? String.format("%d, ", array[i]) : String.format("%d}\n", array[i]));
		}
	}
}
