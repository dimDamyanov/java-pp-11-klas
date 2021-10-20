package unit10;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac001 = new Account(1122, 20000);
		Account.setYearInterestRate(4.5);
		ac001.withdraw(2500);
		ac001.deposit(3000);
		System.out.println(ac001.toString());
	}

}
