package unit17;

public class Circle extends GeometricObject {
	private double radius;
	
	Circle() {
		super();
	}
	
	Circle(double newRadius) {
		super();
		this.setRadius(newRadius);
	}
	
	Circle(double newRadius, String newColor, boolean newFilled) {
		super(newColor, newFilled);
		this.setRadius(newRadius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public double getDiameter() {
		return 2 * this.radius;
	}
	
	public void printCircle() {
		System.out.printf("%s, Radius: %.2f", this.toString(), this.radius);
	}
}
