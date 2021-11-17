package unit15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentId, currentChoice;
		boolean returnToIdChoice = false;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		
		while (true) {
			System.out.print("Enter an id: ");
			currentId = scanner.nextInt();
			returnToIdChoice = false;
			if (currentId >= 0 && currentId < 9) {
				while (true) {
					System.out.print("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n");
					System.out.print("Enter a choice: ");
					currentChoice = scanner.nextInt();
					if (currentChoice > 0 && currentChoice <= 4) {
						switch (currentChoice) {
						case 1:
							System.out.printf("The balance is %.1f\n", accounts[currentId].getBalance());
							break;
						case 2:
							System.out.print("Enter an amount to withdraw: ");
							accounts[currentId].withdraw(scanner.nextDouble());
							break;
						case 3:
							System.out.print("Enter an amount to deposit: ");
							accounts[currentId].deposit(scanner.nextDouble());
							break;
						case 4:
							returnToIdChoice = true;
							break;
						}
					}
					if (returnToIdChoice) {
						break;
					}
				}
			}
		}
	}
}
