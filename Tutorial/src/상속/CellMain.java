package 상속;

public class CellMain {

	public static void main(String[] args) {
		DMBCellPhone dmb = new DMBCellPhone();
		dmb.powerOn();//오버라이딩하지 않으면 부모클래스의 powerOn이 실행//
		dmb.turnOnDmb();
		dmb.changeChannelDmb(100);
		dmb.turnOnDmb();
	}
}
