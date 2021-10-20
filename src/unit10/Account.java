package unit10;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double yearInterestRate = 0;
	private Date dateCreated;
	
	Account() {
		this.dateCreated = new Date();
	}
	Account(int newId, int newBalance) {
		this.setId(newId);
		this.setBalance(newBalance);
		this.dateCreated = new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getYearInterestRate() {
		return yearInterestRate;
	}
	public static void setYearInterestRate(double newYearInterestRate) {
		yearInterestRate = newYearInterestRate;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	public double getMonthlyInterestRate() {
		return yearInterestRate / 12; 
	}
	public double getMonthlyInterest() {
		return (this.getMonthlyInterestRate() / 100) * this.balance;
	}
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println(String.format("WARNING: Amount is negative!", amount));
		}
		else if (amount > this.balance) {
			System.out.println(String.format("WARNING: Balance too low to withdraw %.2f!", amount));
		}
		else {
			this.balance -= amount;
		}
	}
	
	public void deposit(double deposit) {
		if (deposit < 0) {
			System.out.println(String.format("WARNING: Amount is negative!", deposit));
		}
		else {
			this.balance += deposit;
		}
	}
	
	public String toString() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(dateCreated);
		return String.format("ID: %d, Balance: %.2f$, Monthly interest: %.2f$, Date: %s", this.id, this.balance, this.getMonthlyInterest(), date);
	}
}
