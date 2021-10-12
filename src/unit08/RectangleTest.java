package unit08;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(1, 2);
		Rectangle r2 = new Rectangle(2, 3);
		
		System.out.println(r1.toString());
		
		Rectangle.comparePerimeterAndSetColor(r1, r2);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
