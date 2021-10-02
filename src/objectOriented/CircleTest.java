package objectOriented;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println(String.format("The area of the circle of radius %.2f is %.2f", circle1.radius, circle1.getArea()));
		
		Circle circle2 = new Circle(25);
		System.out.println(String.format("The area of the circle of radius %.2f is %.2f", circle2.radius, circle2.getArea()));
		
		Circle circle3 = new Circle(100);
		System.out.println(String.format("The area of the circle of radius %.2f is %.2f", circle3.radius, circle3.getArea()));
		
	}
}
