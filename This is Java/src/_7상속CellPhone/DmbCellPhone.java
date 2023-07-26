package _7상속CellPhone;

public class DmbCellPhone extends CellPhone{

	int channel; //dmb에서만 필요한 속성

	public DmbCellPhone(String model, String color,int channel) {
		super(model, color); // 부모로 부터 상속
		this.channel=channel;
	}
	
	//DMB에서만 사용하는 기능 메소드
	void turnOnDmb() {
		System.out.println("채널"+ channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
