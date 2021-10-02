package loops;

public class Task01 {
	public static void main(String[] args) {
		for(char ch = '!'; ch <= '~'; ch++) {
			System.out.print(ch);
			if (((ch - 33) + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}
