package objectOriented;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount sa0001 = new SavingsAccount(1000, "Damien");
		sa0001.interestRate = 0.02;
		sa0001.deposit(1000);
		sa0001.displayCustomer();
		sa0001.withdraw(10000);
		
		
		SavingsAccount sa0002 = new SavingsAccount(2000, "Bill");
		sa0002.displayCustomer();
	}

}
