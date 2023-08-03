package interfaceex;

import java.rmi.Remote;

public class Television implements RemoteControl {//interface를 implements (상속)
	//추상메소드는 무조건 상속되어 구현되어야한다!
	//디폴트(구현된 메소드)는 상속되었지만 보이지 않는다.(오버라이딩 하면 보임) 사용해도, 안사용해도 된다

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME)
			this.volume=RemoteControl.MAX_VOLUME;
		else if(volume<RemoteControl.MIN_VOULUME)
			this.volume=RemoteControl.MIN_VOULUME;
		else
			this.volume=volume;

		System.out.println("현재 TV소리: "+this.volume);
	}

	public void print() { //Television 클래스에만 있는 기능
		System.out.println("Television 클래스입니다");
	}
	
	
}
