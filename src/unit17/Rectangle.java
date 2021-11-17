package unit17;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	Rectangle() {
		super();
	}
	
	Rectangle(double newWidth, double newHeight) {
		super();
		this.setWidth(newWidth);
		this.setHeight(newHeight);
	}
	
	Rectangle(double newWidth, double newHeight, String newColor, boolean newFilled) {
		super(newColor, newFilled);
		this.setWidth(newWidth);
		this.setHeight(newHeight);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}	
}
