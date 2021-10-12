package objectOriented;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv1 = new TV();
		tv1.turnOn();
		tv1.channelUp();
		tv1.volumeUp();
		System.out.println(tv1.toString());
		
		tv1.turnOff();
		tv1.setChannel(120);
		tv1.setVolume(7);
		tv1.channelUp();
		tv1.volumeUp();
		System.out.println(tv1.toString());
	}

}
