package 상속;

public class DMBCellPhone extends CellPhone {
	int channel;
	
	public DMBCellPhone() {
			System.out.println(model);
			System.out.println(color);
			System.out.println(channel);
	}
	
	public DMBCellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
		
	}
	public void powerOn() {//오버라이딩해야 메인 실행시 DMB powerOn이 실행된다
		System.out.println("DMB폰 전원을 켭니다");
	}
	void turnOnDmb() {
		System.out.println("채널: " + channel+"번 수신");
	}
	void changeChannelDmb(int ch) {
		this.channel=ch;//입력값 ch를 속성 channel에 저장해야함
		System.out.println("채널: " + channel+"번 변경되었습니다.");
	}
	void turnOffDmb() {
		
	}
	
}
