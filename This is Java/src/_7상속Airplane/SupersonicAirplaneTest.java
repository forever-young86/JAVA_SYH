package _7상속Airplane;

public class SupersonicAirplaneTest {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		System.out.println();
		
		sa.flymode=SupersonicAirplane.SUPERSONIC;
		sa.fly(); //모드를 슈퍼소닉으로 바꾸었을때
		System.out.println();
		
		sa.flymode=SupersonicAirplane.NORMAL;
		sa.fly(); //모드를 노멀로 바꾸었을때
		System.out.println();

		sa.land();
	}
}
