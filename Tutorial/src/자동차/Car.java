package 자동차;

public class Car {

	String carName;
	int velocity;
	int carSize;

	public Car() {//기본생성자
		System.out.println("Car 객체 생성자 호출");
	}
	
	
	public Car(String carName, int velocity, int carSize) {
		this.carName = carName;
		this.velocity = velocity;
		this.carSize = carSize;
	}

	//차의 기능 메소드
	public void speedUp(int speed) {
		velocity=velocity+speed;
	}
	public void speedDown(int speed) {
		velocity=velocity-speed;
	}
	public void stop() {
		velocity=0;
	}
	public String getCarInfo() {
		return carName+"의 속도는"+velocity;
	}
		
	
}
