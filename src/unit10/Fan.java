package unit10;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed;
    private boolean switchedOn;
    private double radius;
    private String color;
    
    public int getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
    
    public boolean getSwitchedOn() {
        return this.switchedOn;
    }
    
    public void setSwitchedOn(boolean newSwitchedOn) {
        this.switchedOn = newSwitchedOn;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String newColor) {
        this.color = newColor;
    }
    
    Fan() {
        speed = SLOW;
        switchedOn = false;
        radius = 5;
        color = "Blue";
    }
    
    public String toString() {
        if(this.switchedOn) {
            return String.format("Speed: %d, Color: %s, Radius: %.2f", this.speed, this.color, this.radius);
        }
        else {
            return String.format("The fan is turned off. Color: %s, Radius: %.2f", this.color, this.radius);
        }
    }
}