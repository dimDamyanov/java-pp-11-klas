package objectOriented;

public class SavingsAccount {
	public double balance;
	public double interestRate = 0.01;
	public String name;
	
	public SavingsAccount(double newBalance, String newName) {
		// TODO Auto-generated constructor stub
		balance = newBalance;
		name = newName;
	}
	
	public void displayCustomer() {
		System.out.println("Customer: " + name);
		System.out.println("Balance:" + balance);
		System.out.println("Rate: " + interestRate);
	}
	
	public void deposit(int x) {
		balance += x;
	}
	
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println(String.format("WARNING: Amount is negative!", amount));
		}
		else if (amount > balance) {
			System.out.println(String.format("WARNING: Balance too low to withdraw %.2f!", amount));
		}
		else {
			balance -= amount;
			System.out.println("Balance:" + balance);
		}
	}
}
