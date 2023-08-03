package interfaceEx01;

public class Car {

	/**
	Tire frontLeftTire = new HankookTire(); //인터페이스Tire의 타입 필드(속성)선언과 초기구현 객체 대입
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire(); 
	//같은 타입 Tire를 배열로 만들수 있다. (위에서부터 순서대로 index 0에 대입된다)
	
	void run() {
		frontLeftTire.roll(); //인터페이스에서 있는 추상메소드 호출
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		//공통기능 roll을 쓰기 때문에 반복문으로 쓸수있다.
	}**/
	
	
	Tire [] tires = {new HankookTire(), new HankookTire(), new HankookTire(),new HankookTire()};
	
	void run() {
		for(Tire tire:tires) {
			tire.roll();
		}
	}
}
