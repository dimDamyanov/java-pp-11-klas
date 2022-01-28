package unit22;

public class MovableCircle implements Movable {
	public int radius;
	public MovablePoint center;
	
	MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.center.moveUp();
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.center.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		this.center.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.center.moveRight();
	}
	
	@Override
	public String toString() {
		return String.format("%s, radius=%d", this.center.toString(), this.radius);
	}
}
