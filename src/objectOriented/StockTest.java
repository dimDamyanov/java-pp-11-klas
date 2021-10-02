package objectOriented;

public class StockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		s1.previousClosingPrice = 34.5;
		s1.currentPrice = 34.35;
		System.out.print(String.format("Price change percent: %.2f", s1.getChangePercent()));
		System.out.print("%");
	}

}
