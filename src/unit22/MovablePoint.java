package unit22;

public class MovablePoint implements Movable {
	public int x;
	public int y;
	public int xSpeed;
	public int ySpeed;
	
	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.y += this.ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.y -= this.ySpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		this.x -= this.xSpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.x += this.xSpeed;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), speed=(%d, %d)", this.x, this.y, this.xSpeed, this.ySpeed);
	}

}
