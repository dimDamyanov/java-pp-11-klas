package objectOriented;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}
	
	public double getChangePercent() {
		return Math.abs(currentPrice - previousClosingPrice) / (previousClosingPrice) * 100;
	}
}
