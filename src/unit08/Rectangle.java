package unit08;

public class Rectangle {
	public double width;
	public double height;
	public String color;
	
	Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	
	Rectangle(double newWidth, double newHeight) {
		this.width = newWidth;
		this.height = newHeight;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}
	
	public static void comparePerimeterAndSetColor(Rectangle r1, Rectangle r2) {
		if (r1.getPerimeter() > r2.getPerimeter()) {
			r1.color = "yellow";
			r2.color = "green";
		}
		else {
			r1.color = "green";
			r2.color = "yellow";
		}
	}
	
	// Not required
	
	public String toString() {
		return String.format("Width= %.2f, Height= %.2f, Perimeter= %.2f, Area= %.2f, Color= %s", this.width, this.height, this.getPerimeter(), this.getArea(), this.color);
	}
}
