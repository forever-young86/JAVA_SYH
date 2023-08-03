package interfaceex;

public interface RemoteControl { //인터페이스 선언
	int MAX_VOLUME=10; //모든 리모컨을 사용할때 사용하는 상수선언
	int MIN_VOULUME=0;
	
	//추상메소드: 구현되지 않은 메소드 {중괄호}가 없다.
	//반드시 상속받은곳에서 구현해야한다!
	public void turnOn();
	void turOff();
	void setVolume(int volume);
	
	//디폴트메소드:상속받은 객체에 모두 동일하게 작동하는 기능을 구현하는것을 디폴트로 선언
	//구현된것은 상속받은입장에서 사용하지 않아도 됨(선택적사용)
	default void setMute(boolean mute) {
		if (mute)
			System.out.println("무음처리함");
		else
			System.out.println("무음처리해제");
		}
	
	//정적메소드
	static void chageBattery() {
		System.out.println("건전지를 교체합니다");
	}
}
