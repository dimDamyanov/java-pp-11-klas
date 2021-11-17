package unit17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated = new Date();
	
	GeometricObject() {}
	GeometricObject(String newColor, boolean newFilled) {
		this.color = newColor;
		this.filled = newFilled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(this.dateCreated);
		return String.format("Color: %s, filled: %b, Date created: %s", this.color, this.filled, date);
	}
}
