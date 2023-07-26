package _7상속CellPhone;

public class DmbTest {

	public static void main(String[] args) {
		
		//사용할 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("모델:"+dmbCellPhone.model); //부모에게 상속받은 속성 출력
		System.out.println("색상:"+dmbCellPhone.color);
		
		System.out.println("채널:"+ dmbCellPhone.channel);
		
		//부모로 부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 저는 홍길인데요");
		dmbCellPhone.sendVoice("아~예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
		
	}
}
