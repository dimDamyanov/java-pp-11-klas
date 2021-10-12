package objectOriented;

public class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	TV() {}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	void setChannel(int newChannel) {
		if (newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	
	void setVolume(int newVolumeLevel) {
		if (newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			volumeLevel = newVolumeLevel;
		}
	}
	
	void channelUp() {
		if (channel != 120) {
			channel++;
		}
	}
	
	void channelDown() {
		if (channel != 1) {
			channel--;
		}
	}
	
	void volumeUp() {
		if (volumeLevel != 7)
		volumeLevel++;
	}
	
	void volumeDown() {
		if (volumeLevel != 1) {
			volumeLevel--;
		}
	}
	
	// Not required
	public String toString() {
		return String.format("Channel: %d, TurnedOn: %b, Volume: %d", this.channel, this.on, this.volumeLevel);
	}
}
