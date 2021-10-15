package unit10;

public class FanTest {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Fan f1 = new Fan();
        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("Yellow");
        f1.setSwitchedOn(true);
        
        Fan f2 = new Fan();
        f2.setSpeed(Fan.MEDIUM);
        f2.setRadius(5);
        f2.setColor("Blue");
        f2.setSwitchedOn(false);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
