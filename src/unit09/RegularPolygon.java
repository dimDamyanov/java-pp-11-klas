package unit09;

public class RegularPolygon {
	private int n = 3;
	private double sideLenght = 1;
	private double x = 0;
	private double y = 0;
	
	RegularPolygon() {}
	
	RegularPolygon(int newN, double newSideLenght) {
		this.n = newN;
		this.sideLenght = newSideLenght;
	}
	
	RegularPolygon(int newN, double newSideLenght, double newX, double newY) {
		this.n = newN;
		this.sideLenght = newSideLenght;
		this.x = newX;
		this.y = newY;
	}
	
	public double getN() {
		return this.n;
	}
	public void setN(int newN) {
		this.n = newN;
	}
	
	public double getSideLenght() {
		return this.sideLenght;
	}
	public void setSideLenght(double newSideLenght) {
		this.sideLenght = newSideLenght;
	}
	
	public double getX() {
		return this.x;
	}
	public void setX(double newX) {
		this.x = newX;	
	}
	
	public double getY() {
		return this.y;
	}
	public void setY(double newY) {
		this.y = newY;
	}
	
	public double getPerimeter() {
		return this.n * this.sideLenght;
	}
	
	public double getArea() {
		return (this.n * Math.pow(this.sideLenght, 2)) / (4 * Math.tan(Math.PI / this.n));
	}
}
