package interfaceex;

public class Audio implements RemoteControl {

	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		
	}

	@Override
	public void turOff() {
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME)
			this.volume=RemoteControl.MAX_VOLUME;
		else if(volume<RemoteControl.MIN_VOULUME)
			this.volume=RemoteControl.MIN_VOULUME;
		else
			this.volume=volume;
		System.out.println("현재 Audio소리: "+this.volume);

	}

	public void amp() {
		System.out.println("소리 증폭한다");
	}

	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute)
			System.out.println("Audio를 무음처리함");
		else
			System.out.println("Audio를 무음처리해제함");
	}
	
	
}
