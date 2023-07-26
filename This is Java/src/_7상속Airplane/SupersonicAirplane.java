package _7상속Airplane;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2; //변치않는 값 상수 선언
	
	public int flymode=NORMAL;

	@Override
	public void fly() { //부모것 오버라이딩후 if문을 사용하여 재정의
		if(flymode==SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			super.fly();//부모것 호출
		}
	}
	
	
}
