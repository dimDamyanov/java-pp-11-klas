package unit09;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	Stock(String newSymbol, String newName) {
		this.symbol = newSymbol;
		this.name = newName;
	}
	
	public double getChangePercent() {
		return Math.abs(currentPrice - previousClosingPrice) / (previousClosingPrice) * 100;
	}
	
	public double getPreviousClosingPrice() {
		return this.previousClosingPrice;
	}
	
	public void setPreviousClosingPrice(double newPreviousClosingPrice) {
		this.previousClosingPrice = newPreviousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	
	public void setCurrentPrice(double newCurrentPrice) {
		this.currentPrice = newCurrentPrice;
	}
	
	// Not required
	public String toString() {
		return String.format("Symbol: %s, Name: %s, Previous closing price: %.2f, Current price: %.2f", this.symbol, this.name, this.previousClosingPrice, this.currentPrice);
	}
	
}
