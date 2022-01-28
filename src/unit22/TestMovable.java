package unit22;

public class TestMovable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovablePoint point = new MovablePoint(0, 0, 1, 1);
		point.moveUp();
		System.out.println(point.toString());
		point.moveLeft();
		System.out.println(point.toString());
		point.moveDown();
		System.out.println(point.toString());
		point.moveRight();
		System.out.println(point.toString());
		
		MovableCircle circle = new MovableCircle(0, 0, 2, 2, 1);
		circle.moveRight();
		System.out.println(circle.toString());
		circle.moveRight();
		System.out.println(circle.toString());
		circle.moveRight();
		System.out.println(circle.toString());
		circle.moveRight();
		System.out.println(circle.toString());
	}

}
