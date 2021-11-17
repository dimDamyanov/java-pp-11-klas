package unit07;

public class Circle {
	double radius;
	
	Circle() {
		radius = 1;
	}
	
	Circle(double newRadius) {
		radius = newRadius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}
