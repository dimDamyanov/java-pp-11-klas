package unit17;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	Triangle() {
		super();
	}
	
	Triangle(double newSide1, double newSide2, double newSide3) {
		super();
		this.setSide1(newSide1);
		this.setSide2(newSide2);
		this.setSide3(newSide3);
	}
	
	Triangle(double newSide1, double newSide2, double newSide3, String newColor, boolean newFilled) {
		super(newColor, newFilled);
		this.side1 = newSide1;
		this.side2 = newSide2;
		this.side3 = newSide3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double p = (this.side1 + this.side2 + this.side3) / 2;
		return Math.sqrt(p * (p-this.side1) * (p-this.side2) * (p-this.side3));
	}
	
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public void printTriangle() {
		System.out.printf("Triangle: side1= %.2f, side2= %.2f, side3= %.2f", this.side1, this.side2, this.side3);
	}
}
